/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.clases;

/**
 *
 * @author Urban
 */
public class FiguraGeometrica {
    private double longitud;

    //Constructores
    public FiguraGeometrica() {
    }
    
    public FiguraGeometrica(double longitud) {
        this.longitud = longitud;
    }
    
    //Get and set
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
