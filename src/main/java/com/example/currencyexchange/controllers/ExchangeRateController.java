package com.example.currencyexchange.controllers;

import com.example.currencyexchange.dtos.ChangeCurrencyRequestDto;
import com.example.currencyexchange.dtos.ChangeCurrencyResponseDto;
import com.example.currencyexchange.entities.ExchangeRate;
import com.example.currencyexchange.services.IExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExchangeRateController {
    @Autowired
    private IExchangeRateService service;

    @GetMapping("/ExchangeRate")
    public List<ExchangeRate> getAll(){
        return service.getAll();
    }

    @PostMapping("/ChangeCurrency")
    public ChangeCurrencyResponseDto changeCurrecy(@RequestBody ChangeCurrencyRequestDto requestDto){
        return service.changeCurrency(requestDto);
    }
}
