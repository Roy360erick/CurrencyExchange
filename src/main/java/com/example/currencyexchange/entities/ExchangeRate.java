package com.example.currencyexchange.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "exchange_rate")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "FK_Currency", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Currency currency;
    private float salePriceInDolar;
    private float purchasePriceInDolar;
    private Date creationDate;
    private boolean active;
    private boolean enabled;

    public ExchangeRate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public float getSalePriceInDolar() {
        return salePriceInDolar;
    }

    public void setSalePriceInDolar(float salePriceInDolar) {
        this.salePriceInDolar = salePriceInDolar;
    }

    public float getPurchasePriceInDolar() {
        return purchasePriceInDolar;
    }

    public void setPurchasePriceInDolar(float purchasePriceInDolar) {
        this.purchasePriceInDolar = purchasePriceInDolar;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
