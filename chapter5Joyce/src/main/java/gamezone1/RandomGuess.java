/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author DELL
 */
public class RandomGuess {
    private Integer numero;

    public RandomGuess() {
        this.numero = ((int)(Math.random() * 100) % 100 + 1);
    }
    
    public void lanzar(){
        this.numero = ((int)(Math.random() * 100) % 100 + 1);
    }

    public Integer getNumero() {
        return numero;
    }
    
    public Boolean verifica(Integer n){
        if(n==this.numero){
            System.out.println("Excelente ganaste");
            return true;
        }else if(this.numero<n){
            System.out.println("Un poco alto el numero, intenta de nuevo");
            return false;
        }else{
            System.out.println("Numero bajo, intenta de nuevo");
            return false;
        }
    }
}
