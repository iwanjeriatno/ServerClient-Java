/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overview;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author labrpl
 */
public class Handle extends Thread {
    static Socket sc = null;
    int angka = 0;
    
    Handle(Socket a, int angka) {
        this.angka = angka;
        Handle.sc = a;
    }

    @Override
    public void run() {
        System.out.println("Client Connect  : "+sc.getInetAddress()+
                           "On port         : "+sc.getPort());
        
        try {
//            PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
            DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
            System.out.println("Selamat datang client ke-"+angka);
            System.out.println("\n==================================\n");
        } catch (IOException e) {
            e.getMessage();
        }
    }
   
}
