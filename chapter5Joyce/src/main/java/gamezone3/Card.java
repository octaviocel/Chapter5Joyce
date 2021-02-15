/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

/**
 *
 * @author DELL
 */
public class Card {
    private Palo carta;
    private Integer numero;
    
    public Card(){
        this.setCarta();
        this.setNumero();
    }

    public Palo getCarta() {
        return carta;
    }

    public void setCarta() {
        final int Cardt = 4;
        int nu = ((int) (Math.random () * 100)% Cardt + 1);
        switch (nu) {
            case 1:
                this.carta=Palo.CORAZONES;
                break;
            case 2:
                this.carta=Palo.DIAMANTES;
                break;
            case 3:
                this.carta=Palo.ESPADAS;
                break;
            default:
                this.carta=Palo.TREBOLES;
                break;
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero() {
        final int CARDS_IN_SUIT = 13;
        this.numero = ((int) (Math.random () * 100)% CARDS_IN_SUIT + 1);
    }
    
    public void mostrar(){
        System.out.println(this.getCarta()+" "+this.getNumero());
    }
}
