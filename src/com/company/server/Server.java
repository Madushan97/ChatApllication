package com.company.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        Chat_Server Chat_Server = new Chat_Server();
        Chat_Server.setVisible(true);

//checking main class is working properly
        System.out.println("Server is running...");

//create a server socket
        int port;
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server socket created...");

        while(true){
            //server is running forever...


//accept the connection from client. will wait until a client connects
//        listening state
            Socket client = serverSocket.accept();

            System.out.println("Server accepted a client");

            ClientHandler clientHandler = new ClientHandler(client);
            Thread thread = new Thread(clientHandler);
            thread.start();


        }

//        InputStream and OutputStream

//        send data to the server

//        send data both ways

//        server sends data according to the client input

//        get the user input and sending the data to the server

//        handling multiple clients at the same time -using





    }
}
