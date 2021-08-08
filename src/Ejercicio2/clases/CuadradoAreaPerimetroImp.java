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
public class CuadradoAreaPerimetroImp extends FiguraGeometrica implements ICalcularArea,ICalcularPerimetro{
    
    //Constructores
    public CuadradoAreaPerimetroImp() {
    }

    public CuadradoAreaPerimetroImp(double longitud) {    
        super(longitud);
    }

    //Funciones
    @Override
    public double calcularArea() {
        return Math.pow(super.getLongitud(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return (4*super.getLongitud());
    }
    
}
