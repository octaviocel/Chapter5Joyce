/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author DELL
 */
public class EventDemo {
    public static void main(String[] args) {
        Event ev1= new Event("R230",25);
        Event ev2= new Event("R545",81);
        Event ev3= new Event("R434",364);
        
        Event.logo();
        
        ev1.mostrar();
        System.out.println(ev1.isLargeEvent());
        System.out.println("\n\n");
        ev2.mostrar();
        System.out.println(ev2.isLargeEvent());
        System.out.println("\n\n");
        ev3.mostrar();
        System.out.println(ev3.isLargeEvent());

        System.out.println();
        Event.masGrande(ev1, ev2);
        Event.masGrande(ev2, ev3);
        Event.masGrande(ev2, ev2);
    }
}
