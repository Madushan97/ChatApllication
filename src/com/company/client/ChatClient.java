package com.company.client;

import java.io.*;

public class ChatClient {

    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();

        //what if we can use scanner class instead of this???
        client.sendMessage("Hello From the Client.");
        client.sendMessage("How are you?");
        client.sendMessage("I'm fine");
        client.sendMessage("Thank you.");

    client.sendMessage("exit");

        System.out.println("Client finished the execution");



    }
}