/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import Ejercicio1.clases.cRaices;

/**
 *
 * @author Urban
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejemplo sacado de https://www.youtube.com/watch?v=BxrJmKdPHRs
        System.out.println("Respuestas: x1: "+ new cRaices().calcularRaices(2, 9, 10)[0]+
                " x2:"+new cRaices().calcularRaices(2, 9, 10)[1]);
    }
    
}
