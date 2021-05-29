package com.company.server;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket client;
        public ClientHandler(Socket socket) {
        this.client = socket;
    }
    @Override
    public void run() {

        try {
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
                this.client.close();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

    }

    //two ways to create a thread in java
    //1. Extend a class using thread super class
    //2. implement a class using runnable interface.

}
