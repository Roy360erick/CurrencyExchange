package com.example.currencyexchange.services;

import com.example.currencyexchange.dtos.ChangeCurrencyRequestDto;
import com.example.currencyexchange.dtos.ChangeCurrencyResponseDto;
import com.example.currencyexchange.entities.Currency;
import com.example.currencyexchange.entities.ExchangeRate;
import com.example.currencyexchange.repositories.ICurrencyRepository;
import com.example.currencyexchange.repositories.IExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ExchangeRateService implements IExchangeRateService {
    @Autowired
    private IExchangeRateRepository exchangeRateRepository;

    @Autowired
    private ICurrencyRepository currencyRepository;

    @Override
    public List<ExchangeRate> getAll() {
        return (List<ExchangeRate>) exchangeRateRepository.findAll();
    }

    @Override
    public ChangeCurrencyResponseDto changeCurrency(ChangeCurrencyRequestDto request) {
        Optional<Currency> cOrigin = currencyRepository.findById(request.getOriginCurrency());
        ExchangeRate origin =  exchangeRateRepository.findByCurrencyAndActive(cOrigin,true);

        Optional<Currency> cDestiny =  currencyRepository.findById(request.getDestinyCurrency());
        ExchangeRate destiny =  exchangeRateRepository.findByCurrencyAndActive(cDestiny,true) ;

        ChangeCurrencyResponseDto response = new ChangeCurrencyResponseDto();
        response.setAmount(request.getAmount());
        response.setOriginCurrency(cOrigin.get().getName());
        response.setDestinyCurrency(cDestiny.get().getName());
        if(cOrigin.get().getId() == 1){
            response.setTypeOfChange("Venta");
            response.setAmountFinal(request.getAmount() / destiny.getPurchasePriceInDolar());
        }else{
            response.setTypeOfChange("Compra");
            response.setAmountFinal(request.getAmount() * origin.getSalePriceInDolar());
        }
        return response;
    }
}
