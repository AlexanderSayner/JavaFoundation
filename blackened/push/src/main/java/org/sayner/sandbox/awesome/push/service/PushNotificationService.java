package org.sayner.sandbox.awesome.push.service;

import org.sayner.sandbox.awesome.push.firebase.FCMService;
import org.sayner.sandbox.awesome.push.model.PushNotificationRequest;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class PushNotificationService {
    private final Logger logger = getLogger(PushNotificationService.class);
    private final Map<String, String> defaults = new HashMap<>();
    private final FCMService fcmService;

    public PushNotificationService(FCMService fcmService) {
        this.fcmService = fcmService;
    }

    @PostConstruct
    private void init() {
        defaults.put("topic", "common");
        defaults.put("title", "Common topic - Hello");
        defaults.put("message", "Sending test message \uD83D\uDE42");
        defaults.put("token", "ss22t03wz208eg:APA2idkkow223FE_0v5yHxqCLTyxAQafj6nWaqi4QzwZTW004q1PUux63UsFN");
        defaults.put("payloadMessageId", "123");
        defaults.put("payloadData", "Hello. This is payload content.");
    }

    @Scheduled(initialDelay = 60000, fixedDelay = 60000)
    public void sendSamplePushNotification() {
        try {
            fcmService.sendMessageWithoutData(getSamplePushNotificationRequest());
        } catch (InterruptedException | ExecutionException e) {
            logger.error(e.getMessage());
        }
    }

    public void sendPushNotification(PushNotificationRequest request) {
        try {
            fcmService.sendMessage(getSamplePayloadData(), request);
        } catch (InterruptedException | ExecutionException e) {
            logger.error(e.getMessage());
        }
    }

    public void sendPushNotificationWithoutData(PushNotificationRequest request) {
        try {
            fcmService.sendMessageWithoutData(request);
        } catch (InterruptedException | ExecutionException e) {
            logger.error(e.getMessage());
        }
    }

    public void sendPushNotificationToToken(PushNotificationRequest request) {
        try {
            fcmService.sendMessageToTokenWithData(getSamplePayloadData(), request);
        } catch (InterruptedException | ExecutionException e) {
            logger.error(e.getMessage());
        }
    }


    private Map<String, String> getSamplePayloadData() {
        Map<String, String> pushData = new HashMap<>();
        pushData.put("messageId", defaults.get("payloadMessageId"));
        pushData.put("text", defaults.get("payloadData") + " " + LocalDateTime.now());
        return pushData;
    }


    private PushNotificationRequest getSamplePushNotificationRequest() {
        return new PushNotificationRequest(
                defaults.get("title"),
                defaults.get("message"),
                defaults.get("topic"),
                ""
        );
    }

}
