/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        DigitalCamera camera = new DigitalCamera("Cannon",12);
        DigitalCamera camera2 = new DigitalCamera("Nokia",5);
        DigitalCamera camera3 = new DigitalCamera("Sony",8);
        
        System.out.println("La camara marca "+ camera.getMarca()+" de "+ camera.getMegapixeles()+" megapixeles, cuesta "+ camera.getPrecio());
        System.out.println("La camara marca "+ camera2.getMarca()+" de "+ camera2.getMegapixeles()+" megapixeles, cuesta " + camera2.getPrecio());
        System.out.println("La camara marca "+ camera3.getMarca()+" de "+ camera3.getMegapixeles()+" megapixeles, cuesta "+ camera3.getPrecio());
        
    }
}
