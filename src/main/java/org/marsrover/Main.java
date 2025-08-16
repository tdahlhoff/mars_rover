package org.marsrover;

public class Main {
    public static void main(String[] args) {
        try {
            MarsExpedition marsExpedition = new MarsExpedition();
            marsExpedition.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}