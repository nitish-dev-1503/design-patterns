package com.design.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class PrivacyPolicyHandler {
    private String privacyPolicy;
    private final List<User> subscribers = new ArrayList<>();

    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    public void removeSubscriber(User user) {
        subscribers.remove(user);
    }

    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    public void updatePrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        for (User subscriber : subscribers) {
            subscriber.updatePrivacyPolicy(privacyPolicy);
        }
    }

}
