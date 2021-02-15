/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Lottery {
    private Integer uno;
    private Integer dos;
    private Integer tres;
    
    public Lottery(){
        this.uno= ((int)(Math.random() * 100) % 9 + 0);
        this.dos= ((int)(Math.random() * 100) % 9 + 0);
        this.tres= ((int)(Math.random() * 100) % 9 + 0);
    }
    
    public void verifica(Integer n1, Integer n2, Integer n3){
        if ((n1 == this.uno)&&(n2 == this.dos)&&(n3 == this.tres)) {
            System.out.println("Ha ganado 1,000,000");
        }else if(((n1==uno)||(n1==this.tres)) && ((n2==this.uno)||(n2==this.tres))&&((n3==this.uno)||(n3==this.dos))){
            System.out.println("Ha ganado 1,000");
        }else if((n1==this.dos)||(n1==this.tres)||(n1==this.uno)){
            if((n2==this.uno)||(n2==this.tres)||(n2==this.dos)){
                System.out.println("Has ganado 100");
            }else if((n3==this.uno)||(n3==this.dos)||(n3==this.tres)){
                System.out.println("Has ganado 100");
            }else{
                System.out.println("Has ganado 10");
            }
        }else if((n2==this.uno)||(n2==this.tres)||(n2==this.dos)){
            System.out.println("Has ganado 10");
        }else if((n3==this.dos||(n3==this.uno)||(n3==this.tres))){
            System.out.println("Has ganado 10");
        }else{
            System.out.println("No has ganado");
        }
        
    }
}
