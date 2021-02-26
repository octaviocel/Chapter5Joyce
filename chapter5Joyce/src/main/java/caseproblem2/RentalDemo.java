/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author DELL
 */
public class RentalDemo {
    public static void main(String[] args) {
        Rental r1= new Rental("R9364",28,42);
        Rental r2= new Rental("R8373",23,38);
        Rental r3= new Rental("R2133",28,42);
        Rental.logo();
        
        r1.mostrar();
        System.out.println("\n\n");
        r2.mostrar();
        
        Rental.masLargo(r1, r2);
        Rental.masLargo(r2, r3);
        Rental.masLargo(r1, r3);
    }
}
