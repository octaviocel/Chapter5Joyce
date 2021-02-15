/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

/**
 *
 * @author DELL
 */
public class Die {
    private Integer cara;
    
    public Die(){
        this.lanzar();
    }
    
    public void lanzar(){
        this.cara = ((int)(Math.random() * 100) % 6 + 1);
    }

    public Integer getCara() {
        return cara;
    }    
    
    public static void verifica(Die uno,Die dos){
        System.out.println("Dado uno: "+uno.getCara());
        System.out.println("Dado dos: "+dos.getCara());
        
        if (uno.getCara()==dos.getCara()) {
            System.out.println("Los dados son iguales");
        }else if(uno.getCara()>dos.getCara()){
            System.out.println("El dado 1 es mayor");
        }else{
            System.out.println("El dado 2 es mayor");
        }
    }
}
