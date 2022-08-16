package com.example.currencyexchange.services;

import com.example.currencyexchange.dtos.ChangeCurrencyRequestDto;
import com.example.currencyexchange.dtos.ChangeCurrencyResponseDto;
import com.example.currencyexchange.entities.Currency;
import com.example.currencyexchange.entities.ExchangeRate;

import java.util.List;

public interface IExchangeRateService {
    public List<ExchangeRate> getAll();

    public ChangeCurrencyResponseDto changeCurrency(ChangeCurrencyRequestDto request);
}
