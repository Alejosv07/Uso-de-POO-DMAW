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
public class cFactorial extends cCalculadora{
    
    //Funcion calcula factorial
    public double factorial(int n){
        //Validamos que el dato es mayor o igual a 1 y hacemos lo mismo con 15
        if (n>= 1&& n<=15) {
            double respuesta = 1;
            for (int i = 1; i <= n; i++) {
                respuesta *= i;
            }
            return respuesta;
        }
        
        //Si la condicion no se cumple devolvemos -1 como error
        return -1;
    }
}
