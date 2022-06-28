package com.design.patterns.behavioural.observer;

public class Application {
    public static void main(String[] args) {
        var privacyPolicyHandler = new PrivacyPolicyHandler();

        var ram = new User("Ram");
        var shyam = new User("Shyam");

        privacyPolicyHandler.addSubscriber(ram);
        privacyPolicyHandler.addSubscriber(shyam);

        privacyPolicyHandler.updatePrivacyPolicy("This is our new Privacy Policy");
    }
}
