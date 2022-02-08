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
public class Problema9 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String palabra;
        int numero=0;
        System.out.println("Dame la palabra que le queires contar las vocales ");
        palabra= lectura.next();
    
        for(int i=0;i< palabra.length();i++)
        {
        
            if (palabra.charAt(i)== 'a' || palabra.charAt(i)== 'e'|| palabra.charAt(i)=='i'|| palabra.charAt(i)=='o'||palabra.charAt(i)=='u')
                    {
                      numero++;
                    
                    }
        
        }
        
        System.out.println("La palabra tiene " + numero+" vocales");
    
    }
}
