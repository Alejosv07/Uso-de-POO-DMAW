/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.clases;

import Ejercicio2.Interfaces.ICalcularArea;
import Ejercicio2.Interfaces.ICalcularPerimetro;

/**
 *
 * @author Urban
 */
public class RectanguloAreaPerimetroImp extends FiguraGeometrica implements ICalcularArea,ICalcularPerimetro{
    private double ancho;

    //Constructores
    public RectanguloAreaPerimetroImp() {
    }
    
    public RectanguloAreaPerimetroImp(double longitud) {    
        super(longitud);
    }

    //Get and set
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Funciones
    @Override
    public double calcularArea() {
        return (super.getLongitud()*this.ancho);
    }

    @Override
    public double calcularPerimetro() {
        return ((2*super.getLongitud())+(2*this.ancho));
    }
}
