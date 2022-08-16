package com.example.currencyexchange.controllers;

import com.example.currencyexchange.entities.Currency;
import com.example.currencyexchange.repositories.ICurrencyRepository;
import com.example.currencyexchange.services.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyController {
    @Autowired
    private ICurrencyService service;

    @GetMapping("/Currency")
    public List<Currency> getAll(){
        return service.getAll();
    }


}
