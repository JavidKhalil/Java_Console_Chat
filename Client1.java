package javaapplication6;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    
    public static void main(String[] args) throws IOException{
    
            Socket socket;
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Enter your message to the server");
                String setir = scan.next();
                socket = new Socket("localhost",50000);
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeBytes(setir);
                System.out.println("You entered " + setir);
        socket.close();
        }
    }
}
