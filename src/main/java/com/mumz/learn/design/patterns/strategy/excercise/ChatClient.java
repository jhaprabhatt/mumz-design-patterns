package com.mumz.learn.design.patterns.strategy.excercise;

import static java.util.Objects.requireNonNull;

public class ChatClient {
    private final Encrypter encrypter;

    public ChatClient(Encrypter encrypter) {
        this.encrypter = encrypter;
    }

    public void send(String message) {
        requireNonNull(encrypter);
        final String encryptedMessage = encrypter.encrypt(message);
        System.out.println("Sending the encrypted message..." + encryptedMessage);
    }
}
