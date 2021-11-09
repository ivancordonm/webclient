package com.example.quote.application;

import com.example.quote.domain.Quote;
import reactor.core.publisher.Mono;

public interface ObtainQuote {
    Mono<Quote> getRandomQuote();
}
