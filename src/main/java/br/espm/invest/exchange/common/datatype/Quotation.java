package br.espm.invest.exchange.common.datatype;

import java.util.Date;

public class Quotation {
    private String id;
    private Currency currency;
    private Double value;
    private Date date;

    public Quotation(String id, Currency currency, Double value, Date date) {
        this.id = id;
        this.currency = currency;
        this.value = value;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
