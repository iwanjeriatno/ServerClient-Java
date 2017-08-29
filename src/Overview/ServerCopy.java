/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overview;

import static Overview.Handle.sc;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author labrpl
 */
public class ServerCopy {

    

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1236);
        int urut = 1;
        Socket sc = null;
        int angka = 0;

        System.out.println("Tunggu Client.. \n\n");

        while (true) {
            

            new Thread(new Runnable() {
                @Override
                public void run() {
                        
                    System.out.println("Client Connect  : " + sc.getInetAddress()
                            + "On port         : " + sc.getPort());

                    try {
                        ss.accept();
//            PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
                        DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
                        System.out.println("Selamat datang client ke-" + angka);
                        System.out.println("\n==================================\n");
                    } catch (IOException e) {
                        e.getMessage();
                    }
                }
            }).start();

            System.out.println("Client ke-" + urut + " Masuk");
            urut++;

        }
    }
}
