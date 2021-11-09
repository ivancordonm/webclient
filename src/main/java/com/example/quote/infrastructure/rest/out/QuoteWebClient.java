package com.example.quote.infrastructure.rest.out;

import com.example.quote.domain.Quote;
import com.example.quote.domain.QuoteClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class QuoteWebClient implements QuoteClient {

    private final WebClient webClient;

    public Mono<Quote> getRandomQuote() {
        return webClient.get()
                .uri("/api/random")
                .retrieve()
                .bodyToMono(Quote.class);
    }

}
