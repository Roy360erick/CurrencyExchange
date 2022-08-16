package com.example.currencyexchange.services;

import com.example.currencyexchange.entities.Currency;
import com.example.currencyexchange.repositories.ICurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CurrencyService implements ICurrencyService {
    @Autowired
    private ICurrencyRepository currencyRepository;

    @Override
    public List<Currency> getAll() {
        return currencyRepository.findByEnabled(true);
    }
}
