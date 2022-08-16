package com.example.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class CurrencyExchangeApplication  {


    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeApplication.class, args);
    }

}
