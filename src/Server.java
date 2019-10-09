
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
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
public class Server implements Runnable{
    private ServerSocket servidor;
    private DataInputStream entrada;
    private PrintStream salida;
    private Socket cliente;
    
    public Server(){
        try {
            servidor = new ServerSocket(8080);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void run(){
        
        try{
        while(true){
        System.out.println("Esperando cliente...");
        cliente=servidor.accept();
        entrada = new DataInputStream(cliente.getInputStream());
        System.out.println("Cliente: "+entrada.readLine());
        System.out.println(cliente);
        salida = new PrintStream(cliente.getOutputStream());
        salida.println("Soy el server");
        }
        }catch (IOException e){
            
        }
    }
}
