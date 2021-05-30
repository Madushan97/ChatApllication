package com.company.client;

import javax.swing.*;
import java.io.*;

public class ChatClient {

    public static void main(String[] args) throws IOException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                        Chat_Client Chat_Client = new Chat_Client();
                        Chat_Client.setVisible(true);
            }
        });


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
