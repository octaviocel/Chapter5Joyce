/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author DELL
 */
public class Temperatures {
    private Integer max;
    private Integer min;

    public Temperatures(Integer max, Integer min) {
        this.max = max;
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }
    
    public void variacion(){
        if(this.max>90){
            System.out.println("Heat warning.");
        }
        if(this.min<32){
            System.out.println("Freeze warning.");
        }
        if((this.max-this.min)>=40){
            System.out.println("Large temperature swing.");
        }
    }
}
