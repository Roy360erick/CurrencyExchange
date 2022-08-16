package com.example.currencyexchange.repositories;

import com.example.currencyexchange.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICurrencyRepository extends JpaRepository<Currency,Long> {
    public List<Currency> findByEnabled (boolean enabled);
}
