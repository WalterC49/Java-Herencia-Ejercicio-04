/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_04.Entidades;

import ejercicio_herencia_04.Interfaces.CalculosFormas;
import static java.lang.Math.pow;

/**
 *
 * @author Walter
 */
public final class Circulo implements CalculosFormas {
    private Double diametro;
    
    public Circulo(){
    }

    public Circulo(Double diametro) {
        this.diametro = diametro;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double AreaCirculo() {
        return PI*pow(diametro/2,2);
    }

    @Override
    public double PerimetroCirculo() {
        return PI*diametro;
    }

    @Override
    public double AreaRectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double PerimetroRectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
