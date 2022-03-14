package com.mumz.learn.design.patterns.strategy.excercise;

public class StrategyApplication {

    public static void main(String[] args) {
        var aesEncrypter = new AESEncrypter();
        var aesCompatibleChatClient = new ChatClient(aesEncrypter);

        aesCompatibleChatClient.send("Hello World");

        var desEncrypter = new DESEncrypter();
        var desCompatibleChatClient = new ChatClient(desEncrypter);
        desCompatibleChatClient.send("Hello World");
    }
}
