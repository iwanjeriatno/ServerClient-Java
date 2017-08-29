/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author labrpl
 */
public class SimpleClient {
    Socket s;
    
    public void hubungkanKeServer() throws IOException {
        s = new Socket("localhost", 9000);
    }
    
    public void kirimPesan() throws IOException {
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        System.out.println("Client mengirim pesan : ");
        dos.writeUTF("Hello Server");
    }
    
    public static void main(String[] args) throws IOException {
        SimpleClient client = new SimpleClient();
        client.hubungkanKeServer();
        client.kirimPesan();
        System.out.println("Pesan terkirim!");
    }
}

