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
public class Test {
    public static void main(String[] args) {
        Scholarship student= new Scholarship();
        
        student.setCalificacion(5.0);
        student.setExtras(2);
        student.setServicio(3);
        
        student.actitud();
    }
}
