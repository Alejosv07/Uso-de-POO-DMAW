/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.clases;

/**
 *
 * @author Urban
 */
public class cCalculosExtras extends cCalculadora{
    
    //Funcion de x2 al cuadrado
    public double nCuadradro(double n){
        return Math.pow(n, 2);
    }
    
    //Funcion de x3 al cubo
    public double nCubo(double n){
        return Math.pow(n, 3);
    }
    
    //Funcion de x(Y) al exponente
    public double nExponente(double n,double exponente){
        return Math.pow(n, exponente);
    }
    
    //Funcion de seno
    public double seno(double n){
        return Math.sin(n);
    }
    
    //Funcion de coseno
    public double coseno(double n){
        return Math.cos(n);
    }
    //Funcion de tangente
    public double tangente(double n){
        return Math.tan(n);
    }
    
    //Funcion n!
    public double factorialN(int n){
        //Validamos que el dato es mayor o igual a 1 y hacemos lo mismo con 15
        double respuesta = 1;
        for (int i = 1; i <= n; i++) {
            respuesta *= i;
        }
        
        return respuesta;
    }
}
