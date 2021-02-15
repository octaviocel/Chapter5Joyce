/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Salario trabajador1= new Salario(1,52);
        
        Salario trabajador2= new Salario(3,43);
        System.out.println("Trabajador1");
        trabajador1.jubilacion();
        trabajador1.seguro();
        trabajador1.getSalario();
        System.out.println("Trabajador2");
        trabajador2.jubilacion();
        trabajador2.seguro();
        trabajador2.getSalario();
    }
}
