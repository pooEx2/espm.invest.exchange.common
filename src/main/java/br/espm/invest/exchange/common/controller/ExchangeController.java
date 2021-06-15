package br.espm.invest.exchange.common.controller;

import br.espm.invest.exchange.common.datatype.Currency;
import br.espm.invest.exchange.common.datatype.Quotation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("exchange-service")
public interface ExchangeController {

    @GetMapping("/currency")
    List<Currency> currencies();

    @GetMapping("/currency/{symbol}")
    Currency currency(@PathVariable String symbol);

    @GetMapping("/quotations/{id}")
    Quotation quotation(@PathVariable String id);

    @GetMapping("/quotations/{symbol}/{date}")
    Quotation quotation(
            @PathVariable String symbol,
            @PathVariable String date
    );

    @GetMapping("/quotations")
    List<Quotation> quotations(
            @RequestParam String symbol,
            @RequestParam String start,
            @RequestParam String end
    );
}
