package com.example.webclient.controller;

import com.example.webclient.client.QuoteWebClient;
import com.example.webclient.domain.Quote;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteWebClient quoteWebClient;

    @GetMapping(value = "/random")
    public Mono<Quote> random() {
        return quoteWebClient.getRandomQuote();
    }


}
