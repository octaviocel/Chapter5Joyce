/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Invoice uno = new Invoice(5200,522,1,5,2015);
        Invoice dos = new Invoice(1000,522,-2,45,2015);
        
        uno.mostrar();
        dos.mostrar();
    }
}
