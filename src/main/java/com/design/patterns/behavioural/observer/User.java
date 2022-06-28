package com.design.patterns.behavioural.observer;

public class User {
    private final String name;
    private String privacyPolicy;

    public User(String name) {
        this.name = name;
    }

    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    public void updatePrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        System.out.println("Privacy Policy Updated for " + name);
        System.out.println("Privacy Policy: " + privacyPolicy);
    }
}
