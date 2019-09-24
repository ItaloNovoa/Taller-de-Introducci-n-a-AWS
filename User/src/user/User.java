/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.io.*;
import java.net.*;

public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //long startTime = System.currentTimeMillis();
        hiloConsulta hc=null;
        for (int hilos = 0; hilos < 10; hilos++) {
            hc = new hiloConsulta(hilos, args[0]);
            hc.start();
        }
        hc.join();
        /**
        if(hc.isAlive()!=true){
            long endTime = System.currentTimeMillis() - startTime;
            System.out.println(endTime);
        } */     
    }

}
