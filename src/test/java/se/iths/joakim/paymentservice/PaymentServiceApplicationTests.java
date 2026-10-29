package se.iths.joakim.paymentservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "SECRET_KEY=test-secret-key",
        "PUBLIC_KEY=test-public-key"})
class PaymentServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}