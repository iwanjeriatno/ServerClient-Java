/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overview;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author labrpl
 */
public class ServerBasic {

    public static void main(String[] args) throws IOException {
//        buat server port 1236
        ServerSocket ss = new ServerSocket(1236);
        int urut = 1;
        
        System.out.println("Tunggu Client.. \n\n");

        while (true) {
            
            new Handle(ss.accept(), urut).start();
            
            System.out.println("Client ke-" + urut + " Masuk");
            urut++;
           
        }
    }
}
