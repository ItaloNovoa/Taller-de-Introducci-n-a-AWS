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
      URL url = new URL(args[0]); 
      try (BufferedReader reader = new BufferedReader(
          new InputStreamReader(url.openStream()))) { 
            String inputLine = null; 
            while ((inputLine = reader.readLine()) != null) { 
                  System.out.println(inputLine); 
             } 
       } catch (IOException x) { 
               System.err.println(x); 
       } 
    } 
    
}
