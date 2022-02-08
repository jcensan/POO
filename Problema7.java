/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.POO;

import java.util.Scanner;
/**
 *
 * @author jcensan
 */
public class Problema7 {
    
    public static void main(String[] args){
    int numero;
    int mayor=0;
    Scanner lee= new Scanner(System.in);
    
    for(int i=1;i<=4;i++)
    {
      System.out.println("Dame el numero " + i);
       numero= lee.nextInt();
       
       if(numero> mayor){
          mayor = numero;
       }
    }
    
    System.out.print("El mauyo de los 4 número es "+ mayor);
    
    }
    
    
}
