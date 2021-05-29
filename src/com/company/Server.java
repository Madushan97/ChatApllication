package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

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

            Thread.sleep(30000);    //wait foe 30 second before  executing the rest of the code

//getting data
            InputStream inputStream = client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
            DataOutputStream OutputStream =new DataOutputStream(client.getOutputStream());

//        read again and again until inputData null(continous reading data from client)
            String inputData;
            while ((inputData = bufferedReader.readLine()) != null){

                System.out.println("client says:" + inputData);

                //send data to client

                switch (inputData){
                    case "hello From the client.":
                        OutputStream.writeBytes("Hello from the server...\n");
                        break;
                    case "How are you?":
                        OutputStream.writeBytes("I'm fine how are you?...\n");
                        break;
                    case "I'm fine":
                        OutputStream.writeBytes("Okay good to know...\n");
                        break;
                    default:
                        OutputStream.writeBytes("I didn't get it...\n");
                }

                OutputStream.writeBytes("Hello from the server...\n");

                if(inputData.equals("exit")){
                    break;
                }

            }

//        going to send some data server to client
//
//

            client.close();

        }

//        InputStream and OutputStream

//        send data to the server

//        send data both ways

//        server sends data according to the client input

//        get the user input and sending the data to the server

//        handling multiple clients at the same time -using





    }
}
