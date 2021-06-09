package br.espm.invest.exchange.common.controller;

import br.espm.invest.exchange.common.datatype.Currency;
import br.espm.invest.exchange.common.datatype.Quotation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("exchange-service")
public interface ExchangeController {

    @GetMapping("/currency")
    List<Currency> currencies();

    @GetMapping("/currency/{symbol}")
    Currency currency(String symbol);

    @GetMapping("/quotations")
    List<Quotation> quotations(
            @RequestParam String symbol,
            @RequestParam String start,
            @RequestParam String end
    );

    @GetMapping("/quotations/{id}")
    Quotation quotation(String id);
}
