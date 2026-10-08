package se.iths.joakim.paymentservice.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.iths.joakim.paymentservice.dto.PaymentRequest;
import se.iths.joakim.paymentservice.dto.PaymentResponse;
import se.iths.joakim.paymentservice.service.StripeService;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final StripeService stripeService;

    @PostMapping("/create-intent")
    public ResponseEntity<PaymentResponse> createPaymentIntent(
            @Valid @RequestBody PaymentRequest request) {
        PaymentResponse response =
                stripeService.createPaymentIntent(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}