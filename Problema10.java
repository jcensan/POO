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
public class Problema10 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int cuenta=0, tamano;
        String palabra;
        
        System.out.println("Dame la palabra : ");
        palabra=lectura.next();
        tamano= palabra.length()-1;
        
        for(int i =0; i<palabra.length(); i++)
        {
          if(palabra.charAt(i)==palabra.charAt(tamano-i))
              cuenta++;
        
        }
        
        if (cuenta== palabra.length())
            System.out.println("La palabra " +palabra +  " es un palíndromo");
        else
            System.out.println("La palabra "+ palabra + " no es un palíndromo");
                
    }
}
