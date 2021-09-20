package org.sayner.sandbox.soap.service;

import org.sayner.sandbox.soap.generated.AwesomeUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public AwesomeUser findUserByEmail(final String email) {
        final AwesomeUser user = new AwesomeUser();
        user.setEmail("опаньки");
        user.setId(-1);
        user.setName("awesome");
        return user;
    }

    public void fluxUser() {
        WebClient webClient = WebClient
                .builder()
                .baseUrl("http://localhost:8181")
                .build();
        String string = webClient
                .get()
                .uri("/awesome")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        logger.info(String.format("A message has arrived: %s", string));

    }
}
