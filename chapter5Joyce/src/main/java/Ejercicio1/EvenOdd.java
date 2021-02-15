/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author DELL
 */
public class EvenOdd {

    private Integer numero;

    public EvenOdd() {
        this.numero=1;
    }

    public EvenOdd(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String par(){
        if(this.numero%2 == 0){
            return "El numero es par";
        }else{
            return "El numero es impar";
        }
    }
}
