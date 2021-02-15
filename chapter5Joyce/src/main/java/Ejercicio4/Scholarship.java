/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author DELL
 */
public class Scholarship {

    private Double calificacion;
    private Integer extras;
    private Integer servicio;

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getExtras() {
        return extras;
    }

    public void setExtras(Integer extras) {
        this.extras = extras;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public void actitud() {
        if (this.verificar()) {
            if ((this.calificacion >= 3.8) && (this.extras >= 1) && (this.servicio >= 1)) {
                System.out.println("Scholarship candidate");
            } else if ((this.calificacion >= 3.4) && (this.extras >= 3) && (this.servicio >= 3)) {
                System.out.println("Scholarship candidate");
            } else if ((this.calificacion >= 3.0) && (this.extras >= 2) && (this.servicio >= 3)) {
                System.out.println("Scholarship candidate");
            } else {
                System.out.println("Not a candidate.");
            }
        } else {
            System.out.println("Datos no validos");
        }
    }

    private Boolean verificar() {
        if ((this.calificacion < 0) || (this.calificacion > 4) || (this.extras < 0) || (this.servicio < 0)) {
            return false;
        } else {
            return true;
        }
    }
}
