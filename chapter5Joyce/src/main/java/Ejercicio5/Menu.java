/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author DELL
 */
public class Menu {
    private Coffee[] menu;
    
    public Menu(){
        this.menu= new Coffee[3];
        this.inicializar();
    }
    
    private void inicializar(){       
        this.menu[0]= new Coffee("American",1.99);
        this.menu[1]=new Coffee("Espresso",2.50);
        this.menu[2]=new Coffee("Latte",2.15);
    }

    public void getMenu() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Cafe ["+(i+1)+"]: "+this.menu[i].getCafe()+" precio:"+ this.menu[i].getPrecio());
        }
    }

    public void setMenu(Coffee[] menu) {
        this.menu = menu;
    }
    
    public Double precio(Integer n){
        if(n==1){
            return this.menu[0].getPrecio();
        }else if(n==2){
            return this.menu[1].getPrecio();
        }else if(n==3){
            return this.menu[2].getPrecio();
        }else{
            return 0.0;
        }
    }
}
