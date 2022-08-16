package com.example.currencyexchange.dtos;

public class ChangeCurrencyRequestDto {
    private Long originCurrency;
    private Long destinyCurrency;
    private Float amount;

    public Long getOriginCurrency() {
        return originCurrency;
    }

    public void setOriginCurrency(Long originCurrency) {
        this.originCurrency = originCurrency;
    }

    public Long getDestinyCurrency() {
        return destinyCurrency;
    }

    public void setDestinyCurrency(Long destinyCurrency) {
        this.destinyCurrency = destinyCurrency;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
