/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Lottery mano= new Lottery();
        Scanner pen = new Scanner(System.in);
        
        System.out.println("Dame tus tres numeros al juego");
        
        mano.verifica(pen.nextInt(), pen.nextInt(), pen.nextInt());
    }
}
