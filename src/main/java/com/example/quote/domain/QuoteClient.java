package com.example.quote.domain;

import reactor.core.publisher.Mono;

public interface QuoteClient {
    Mono<Quote> getRandomQuote();
}
