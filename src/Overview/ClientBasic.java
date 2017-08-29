/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overview;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author labrpl
 */
public class ClientBasic {

    public static void main(String[] args) throws IOException {
//        buat client
        Socket sk = new Socket("127.0.0.1", 1236);
//        BufferedReader in = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        DataInputStream dis = new DataInputStream(sk.getInputStream());
        String put = "";
        
        System.out.println("Berhasil Masuk!");

        while (true) {
            if ((put = dis.readUTF()) != null) {
                System.out.println(put);
            }
        }
    }
}
