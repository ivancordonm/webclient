package com.example.quote.infrastructure.rest.in;

import com.example.quote.application.ObtainQuote;
import com.example.quote.domain.Quote;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final ObtainQuote quoteService;

    @GetMapping(value = "/random")
    public Mono<Quote> random() {
        return quoteService.getRandomQuote();
    }

}
