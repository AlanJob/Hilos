/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlanJob
 */
public class Hilo implements Runnable{
    private int id;
    public static int counter=0;
    public static Object cerrojo = new Object();
    public Hilo(int id){
        this.id=id;
    }
    
    @Override
    public void run() {
        
        synchronized(cerrojo){
      
        for(int i=0;i<20000;i++){
            counter++;
        }
    }
        System.out.println(counter);
    }
    
    
}
