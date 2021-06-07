package br.espm.invest.exchange.common.controller;

import br.espm.invest.exchange.common.datatype.Currency;
import br.espm.invest.exchange.common.datatype.Quotation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("exchange-service")
public interface ExchangeController {

    @GetMapping("/currency")
    List<Currency> listAll();

    @GetMapping("/quotation/{id}")
    Quotation quotation(String id);

    @GetMapping("/quotation/{currency}")
    List<Quotation> quotations(String Currency);
}
