/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    
    public static void main(String[] args) throws IOException {
        
        ServerSocket serversocket = new ServerSocket(50000);
        
        while(true){
            Socket socket = serversocket.accept();
            InputStreamReader input = new InputStreamReader(socket.getInputStream()); 
            BufferedReader br = new BufferedReader(input);
            String str = br.readLine();
            System.out.println("Client sent " + str);
        }
    
    }
    
}
