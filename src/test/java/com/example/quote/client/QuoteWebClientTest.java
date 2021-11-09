package com.example.quote.client;

import com.example.quote.domain.Quote;
import com.example.quote.domain.Value;
import com.example.quote.infrastructure.rest.out.QuoteWebClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class QuoteWebClientTest {

    private QuoteWebClient quoteWebClient;

    @Mock
    private WebClient                       webClientMock;
    @Mock
    private WebClient.RequestHeadersSpec    requestHeadersMock;
    @Mock
    private WebClient.RequestHeadersUriSpec requestHeadersUriMock;
    @Mock
    private WebClient.ResponseSpec          responseMock;

    @BeforeEach
    void setUp() {
        quoteWebClient = new QuoteWebClient(webClientMock);
    }

//    @Test
//    @DisplayName("Get a random quote")
//    void getRandomQuote() {
//
//        Quote mockQuote = new Quote("success", new Value(10, "This is a random quote mock"));
//
//        when(webClientMock.get()).thenReturn(requestHeadersUriMock);
//        when(requestHeadersUriMock.uri("/api/random")).thenReturn(requestHeadersMock);
//        when(requestHeadersMock.retrieve()).thenReturn(responseMock);
//        when(responseMock.bodyToMono(Quote.class)).thenReturn(Mono.just(mockQuote));
//
//        Mono<Quote> quoteMono = quoteWebClient.getRandomQuote();
//
//        StepVerifier.create(quoteMono)
//                .expectNextMatches(quote -> quote.getType()
//                        .equals("success"))
//                .verifyComplete();
//    }

}
