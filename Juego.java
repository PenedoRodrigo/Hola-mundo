/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.util.*;
public class Juego {

    public static void main(String[] args) {
        int aleatoreo= (int)(Math.random()*100);
        //creo variable de entrada
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
            while(numero!=aleatoreo){
            intentos++;    
            System.out.println ("introduce un numero");
            numero=entrada.nextInt();
            if (aleatoreo<numero){
            System.out.println ("Mas bajo");}
            else if (aleatoreo>numero){
            System.out.println ("Mas alto");
        }}
        System.out.println("correcto!!!\nlo has onseguido en " + intentos + " intentos ");
        }}
