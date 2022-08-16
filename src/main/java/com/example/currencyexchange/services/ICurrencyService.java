package com.example.currencyexchange.services;

import com.example.currencyexchange.entities.Currency;

import java.util.List;

public interface ICurrencyService {
    public List<Currency> getAll();
}
