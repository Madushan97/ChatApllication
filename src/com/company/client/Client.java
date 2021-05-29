package com.company.client;

import java.io.*;
import java.net.Socket;

//reusable  client(purpose: add multiple client to server)
public class Client {

    Socket client;
    DataOutputStream outputStream;
    BufferedReader bufferedReader;

    //even you can place this start method code in a constructor
    public void start() throws IOException {
        System.out.println("Client is running...");
//create a socket in client side
        Socket socket = new Socket("localhost", 6000);
        this.outputStream = new DataOutputStream(socket.getOutputStream());
        InputStream inputStream = socket.getInputStream();
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

//        wait until all this will buffer

        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(inputStream)));

    }
    public void sendMessage(String message) throws IOException{
        System.out.println("client says: " + message);
        this.outputStream.writeBytes(message + "\n");
        String dataFromServer = this.bufferedReader.readLine();
        System.out.println("Server says:" + dataFromServer);
    }


}
