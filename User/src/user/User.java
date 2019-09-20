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
      for (int hilos=0; hilos<100;hilos++){
        hiloConsulta hc= new hiloConsulta(hilos,"https://boiling-scrubland-02497.herokuapp.com");
        hc.start();
    }
    } 
    
}
