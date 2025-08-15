package org.mars_rover;

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