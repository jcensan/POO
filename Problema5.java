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
public class Problema5 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numero =0;
        
        System.out.println("Progama que solicita 10 números y los promedia");
        
        for(int i=1 ; i<= 10;i++)
        {
          System.out.println("Dame el número " + i);
           numero = numero + lectura.nextInt();
        
        
        }
        
        System.out.println("El promedio de los 10 números es "+ (numero/10));
        
    }
    
}
