package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class hiloConsulta extends Thread {

    String argumentos;
    URL url;
    int numeroHilo;

    hiloConsulta(int numeroHilo, String argumentos) throws MalformedURLException {
        this.argumentos = argumentos;
        this.url = new URL(argumentos);
        this.numeroHilo=numeroHilo;
    }

    public void run() {
        
        for (int i = 0; i < 10; i++) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String inputLine = null;
                //System.out.println("SOY EL HILO NUMERO "+numeroHilo);                
                while ((inputLine = reader.readLine()) != null) {
                }
            } catch (IOException x) {
                //System.err.println(x);
            }
        }
        
    }
}