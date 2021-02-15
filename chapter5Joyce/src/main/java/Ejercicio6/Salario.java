/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Salario {

    private Integer nivel;
    private Integer horas;
    private Integer hrsextra;
    private Double salario;
    private Double seguro;
    private Double jubi;
    private final Double level1 = 17.0;
    private final Double level2 = 20.0;
    private final Double level3 = 22.0;
    private final Double medical = 32.50;
    private final Double dental = 20.0;
    private final Double desability = 10.0;

    Scanner pen = new Scanner(System.in);

    public Salario(Integer nivel, Integer horas) {
        this.nivel = nivel;
        this.horas = horas;
        if(horas>40){
            this.hrsextra = horas-40;}
        else{
            this.hrsextra=0;
        }
        this.salario();
        this.jubi = 0.0;
    }

    private void salario() {
        switch (this.nivel) {
            case 1:
                this.salario = (this.level1 * this.horas) + (this.level1 * 1.5 * this.hrsextra);
                break;
            case 2:
                this.salario = (this.level2 * this.horas) + (this.level2 * 1.5 * this.hrsextra);
                break;
            case 3:
                this.salario = (this.level3 * this.horas) + (this.level3 * 1.5 * this.hrsextra);
                break;
            default:
                this.seguro = 0.0;
                break;
        }
    }

    public void jubilacion(){
        if(this.nivel==3){
            System.out.println("Deseas agregar jubilacion plan [1]si   [0]no");
            int n= pen.nextInt();
            if(n==1){
                this.jubi=this.salario*0.03;
            }
        }else{
            System.out.println("No tienes nivel para elegir jubilacion");
        }
    }
    public void seguro() {
        if (this.nivel > 1) {
            System.out.println("Que seguro quieres:\n 1 Medical insurance 32.50\n"
                    + "2 Dental insurance 20.00\n"
                    + "3 Long-term disability insurance 10.00");
            int n = pen.nextInt();
            switch (n) {
                case 1:
                    this.seguro = medical;
                    break;
                case 2:
                    this.seguro = dental;
                    break;
                case 3:
                    this.seguro = desability;
                    break;
                default:
                    this.seguro = 0.0;
                    break;
            }
        } else {
            System.out.println("No tienes el nivel para elegir seguro");
            this.seguro = 0.0;
        }
    }

    public void getSalario(){
        Double sal =this.salario-this.jubi-this.seguro;
        if(sal>0){
            System.out.println("Tu salario es:"+sal);
        }else{
            System.out.println("Datos erroneos");
        }
    }
}
