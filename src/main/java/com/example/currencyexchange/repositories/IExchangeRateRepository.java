package com.example.currencyexchange.repositories;

import com.example.currencyexchange.entities.Currency;
import com.example.currencyexchange.entities.ExchangeRate;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IExchangeRateRepository extends CrudRepository<ExchangeRate,Long> {
    public ExchangeRate findByCurrencyAndActive(Optional<Currency> currency,boolean active);
}
