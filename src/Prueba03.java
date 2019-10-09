/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlanJob
 */
public class Prueba03 {
    
    public static void main(String args[]){
        
        for(int i=0;i<5;i++){
        new Thread(new Cliente()).start();
        }
    }
    
}
