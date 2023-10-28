/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author usuario
 */
public abstract class Prenda {
    String marca;
    int stock;
    Double precio;
    String talla;
    String genero;
    String color;

    public Prenda(String marca, int stock, Double precio) {
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
    }

    public Prenda(String talla, String sexoDestinado, String color) {
        this.talla = talla;
        this.genero = sexoDestinado;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSexoDestinado() {
        return genero;
    }

    public void setSexoDestinado(String sexoDestinado) {
        this.genero = sexoDestinado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public abstract String mostrarDetalle();
    
}
