/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CondoSales {
    private Integer condominio;
    
    public CondoSales(){
        this.condominio=0;
    }
    
    public void precio(){
        Scanner pen= new Scanner(System.in);
        System.out.print("Dime con que vista lo quieres:");
        System.out.println("1 for park view, 2 for golf course view, or 3 for lake view");
        int n = pen.nextInt();
        switch (n) {
            case 1:
                this.condominio=150000;
                break;
            case 2:
                this.condominio=170000;
                break;
            case 3:
                this.condominio=210000;
                break;
            default:
                this.condominio=0;
                break;
        }
    }
    
    public void garaje(){
        Scanner pen= new Scanner(System.in);
        System.out.print("Dime espacio");
        System.out.println("(1) garage or a (2) parking space");
        int n = pen.nextInt();
        if(n==1|| n==2){
            System.out.println("Tu condomio vale: "+this.condominio+" mas el garaje valdra: "+(this.condominio+5000));
        }else{
            System.out.println("No seleccionaste espacio para garaje, entonces tu condominio valdra: "+this.condominio);
        }
    }
}
