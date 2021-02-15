/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author DELL
 */
public class DigitalCamera {

    private String marca;
    private Integer megapixeles;
    private Integer precio;

    public DigitalCamera(String marca, Integer megapixeles) {
        this.marca = marca;
        if (megapixeles < 10) {
            this.megapixeles = megapixeles;
        } else {
            this.megapixeles=10;
        }
        if (megapixeles <= 6) {
            this.precio = 99;
        } else {
            this.precio=129;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(Integer megapixeles) {
        this.megapixeles = megapixeles;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

}
