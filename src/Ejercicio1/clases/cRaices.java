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
public class cRaices extends cCalculadora{
    
    //Funcion para encontrar raices por formula general
    public String[] calcularRaices(double a, double b,double c){
        /*
            Teniendo en cuenta los siguientes casos
            b. Si a y b son iguales a 0 deberá mostrar el mensaje ecuación degenerada.
            c. Si a es igual a 0 y b no es igual a 0. Existe una raíz única con valor –c/b
            d. En los demás casos, utilizaremos la formula general.
        
            Se tomo en cuenta que para saber el tipo de error se enviara un array con los siguientes valores
                N)operacion_logica then salida /mensaje a mostrar
                1)a==0 && b==0 then new double[]{-1,-1,-1} /ecuación degenerada 
                2)a==0 && b!=0 then new double[]{(-c/b)} /raíz única
                3)b^2-4ac<0 then new double[]{-1,-1,-2} /no se puede operar
        */
        if (a==0 && b==0) {
            //b
            return new String[]{"Ecuacion degenerada"};
        }
        if (a==0 && b!=0) {
            //c
            //–c/b
            return new String[]{String.valueOf((-c/b))};
        }
        
        //d
        double discriminante=0;
        
        //Raiz con signo positivo
        discriminante = (Math.pow(b, 2))-(4*a*c);
        
        
        /*
            La expresión b^2-4ac se denomina discriminante
            1. Si el resultado es mayor o igual a 0 hay 2 raíces reales
            2. Si el resultado es menor que 0 hay 2 raíces complejas, muestre el mensaje no se puede
            operar.
        */
        if (discriminante>=0) {
            //Raices reales
            String rRaices[] = new String[2];
            
            rRaices[0] = String.valueOf((-b + (Math.sqrt(discriminante)))/(2*a));
            rRaices[1] = String.valueOf((-b - (Math.sqrt(discriminante)))/(2*a));
            
            return rRaices;
        } 
        
        return new String[]{"No se puede operar"};
    }
}
