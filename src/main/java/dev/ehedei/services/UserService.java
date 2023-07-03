package dev.ehedei.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private NotificationService notificationService;

    @Autowired
    public UserService(final NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
