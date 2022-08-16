package com.example.currencyexchange.dtos;

public class ChangeCurrencyResponseDto {
    private String OriginCurrency;
    private String DestinyCurrency;
    private Float Amount;
    private Float AmountFinal;
    private String TypeOfChange;

    public String getOriginCurrency() {
        return OriginCurrency;
    }

    public void setOriginCurrency(String originCurrency) {
        OriginCurrency = originCurrency;
    }

    public String getDestinyCurrency() {
        return DestinyCurrency;
    }

    public void setDestinyCurrency(String destinyCurrency) {
        DestinyCurrency = destinyCurrency;
    }

    public Float getAmount() {
        return Amount;
    }

    public void setAmount(Float amount) {
        Amount = amount;
    }

    public Float getAmountFinal() {
        return AmountFinal;
    }

    public void setAmountFinal(Float amountFinal) {
        AmountFinal = amountFinal;
    }

    public String getTypeOfChange() {
        return TypeOfChange;
    }

    public void setTypeOfChange(String typeOfChange) {
        TypeOfChange = typeOfChange;
    }
}
