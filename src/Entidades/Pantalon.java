/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.Descuento;

/**
 *
 * @author usuario
 */
public class Pantalon extends Prenda
                        implements Descuento{

    public Pantalon(String marca, int stock, Double precio) {
        super(marca, stock, precio);
    }

    @Override
    public String mostrarDetalle() {
        return "";
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        
    }
    
}
