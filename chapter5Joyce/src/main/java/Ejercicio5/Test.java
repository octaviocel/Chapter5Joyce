/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Menu cafe= new Menu();
        Scanner pen = new Scanner(System.in);
        cafe.getMenu();
        int n=0;
        Double precio=0.0;
        
        do{
            System.out.println("Listo para ordenar: precione alguna de las opciones, para pagar precione 0");
            n=pen.nextInt();
            precio=precio+cafe.precio(n);
        }while(n!=0);
        System.out.println("El total de sus cafes es: "+ precio+" dolares");
    }
}
