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
public class Test {
    public static void main(String[] args) {
        Temperatures tem= new Temperatures(70,30);
        Temperatures tem2= new Temperatures(92,20);
        Temperatures tem3= new Temperatures(50,40);
        
        tem.variacion();
        tem2.variacion();
        tem3.variacion();
    }
}
