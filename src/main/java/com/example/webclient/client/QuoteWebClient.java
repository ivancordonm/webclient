package com.example.webclient.client;

import com.example.webclient.domain.Quote;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class QuoteWebClient {

    private final WebClient webClient;

    public Mono<Quote> getRandomQuote() {
        return webClient.get()
                .uri("/api/random")
                .retrieve()
                .bodyToMono(Quote.class);
    }

}
