/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

/**
 *
 * @author DELL
 */
public class TwelveDays {

    private Integer dia;
    private final String verso = "A day of Christmas my true love gave to me";
    private final String dia1 = "A partridge in a pear tree";
    private final String dia2 = "Two turtle doves ";
    private final String dia3 = "Three French hens";
    private final String dia4 = "Four calling birds";
    private final String dia5 = "Five gold rings";
    private final String dia6 = "Six geese a laying";
    private final String dia7 = "Seven swans a swimming";
    private final String dia8 = "Eight maids a milking";
    private final String dia9 = "Nine ladies dancing";
    private final String dia10 = "Ten lords a leaping";
    private final String dia11 = "Eleven pipers piping";
    private final String dia12 = "Twelve drummers drumming";

    public TwelveDays() {
        this.dia = 1;
    }

    public void diaMas(){
        this.dia=this.dia+1;
        if(this.dia>12){
            this.dia=1;
        }
    }
    public void setDia(Integer dia){
        this.dia=dia;
    }
    
    public void getCancion(){
        System.out.println(verso);
        System.out.println(this.getVerso(this.dia));
    }
    
    private String getVerso(Integer n){
        if(n==1){
            return this.dia1;
        }else{
            return getVerso(n-1)+"\n"+getParrafo(n);
        }
    }
    
    private String getParrafo(Integer n){
        switch(n){
            case 12: 
                return dia12;
            case 11:
                return dia11;
            case 10:
                return dia10;
            case 9: 
                return dia9;
            case 8:
                return dia8;
            case 7:
                return dia7;
            case 6:
                return dia6;
            case 5: 
                return dia5;
            case 4:
                return dia4;
            case 3: 
                return dia3;
            case 2: 
                return dia2;
            default:
                return "No hay mas";               
            
            
                
        }
                
    }
}
