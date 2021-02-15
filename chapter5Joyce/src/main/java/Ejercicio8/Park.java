/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author DELL
 */
public class Park {

    private String name;
    private Integer acres;
    private Boolean picnic;
    private Boolean tennis;
    private Boolean playground;
    private Boolean pool;

    public Park(String name, Integer acres, Boolean picnic, Boolean tennis, Boolean playground, Boolean pool) {
        this.name = name;
        if (acres > 400 || acres < 0) {
            System.out.println("Valor de acres no valido se asignara 0");
            this.acres = 0;
        } else {
            this.acres = acres;
        }
        this.picnic = picnic;
        this.tennis = tennis;
        this.playground = playground;
        this.pool = pool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAcres() {
        return acres;
    }

    public void setAcres(Integer acres) {
        this.acres = acres;
    }

    public Boolean getPicnic() {
        return picnic;
    }

    public void setPicnic(Boolean picnic) {
        this.picnic = picnic;
    }

    public Boolean getTennis() {
        return tennis;
    }

    public void setTennis(Boolean tennis) {
        this.tennis = tennis;
    }

    public Boolean getPlayground() {
        return playground;
    }

    public void setPlayground(Boolean playground) {
        this.playground = playground;
    }

    public Boolean getPool() {
        return pool;
    }

    public void setPool(Boolean pool) {
        this.pool = pool;
    }

}
