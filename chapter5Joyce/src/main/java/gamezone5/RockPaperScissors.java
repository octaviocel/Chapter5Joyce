/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RockPaperScissors {
    
    private Integer usuario;
    private Integer pc;

    public void jugar() {
        Scanner pen = new Scanner(System.in);
        System.out.println("[1]Piedra [2]Papel [3]Tijeras");
        setOpcionPC();
        //System.out.println(getPc());
        this.usuario = pen.nextInt();

        if (this.usuario == this.pc) {
            System.out.println("Empate");
        } else if ((this.usuario == 1 && this.pc == 3) ||(this.usuario == 2 && this.pc == 1) ||(this.usuario == 3 && this.pc == 2)  ){
            System.out.println("Ganas");

        } else if ((this.usuario == 1 && this.pc == 2) || (this.usuario == 2 && this.pc == 3) || (this.usuario == 3 && this.pc == 1)){
            System.out.println("Pierdes");
        }

    }

    public Integer getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Integer opcion) {
        this.usuario = opcion;
    }

    public Integer getPc() {
        return this.pc;
    }

    private void setOpcionPC() {
        this.pc = (int) (Math.random() * 3 + 1);
    }
}
