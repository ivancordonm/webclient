package com.example.quote.application;

import com.example.quote.domain.Quote;
import com.example.quote.domain.QuoteClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class QuoteService implements ObtainQuote {

    private final QuoteClient quoteClient;

    @Override
    public Mono<Quote> getRandomQuote() {
        return quoteClient.getRandomQuote();
    }

}
