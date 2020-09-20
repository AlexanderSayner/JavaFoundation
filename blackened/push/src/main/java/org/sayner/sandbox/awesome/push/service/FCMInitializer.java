package org.sayner.sandbox.awesome.push.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.slf4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class FCMInitializer {
    private final Logger logger = getLogger(FCMInitializer.class);

    @PostConstruct
    public void initialize() {
        try {
            final ClassPathResource resource =
                    new ClassPathResource("awesomesandbox-93ab4-firebase-adminsdk-t18vg-123b5d247e.json");

            final FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(resource.getInputStream()))
                    .setDatabaseUrl("https://awesomesandbox-93ab4.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
