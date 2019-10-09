
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlanJob
 */
public class Cliente implements Runnable{
    Socket cliente;
    DataInputStream entrada;
    PrintStream salida;
    
    public Cliente(){
        try {
            cliente = new Socket("localhost", 8080);
            entrada = new DataInputStream(cliente.getInputStream());
            salida = new PrintStream(cliente.getOutputStream());
            
            salida.println("Soy el cliente");
            
            String cadena = entrada.readLine();
            System.out.println("Servidor: "+cadena);

        } catch (IOException ex) {
        }
    }
    
    public void run(){
        
    }
}
