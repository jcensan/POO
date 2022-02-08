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
public class Problema8 {
    
    public static void main(String[] args) {
        double base, altura, superficie;
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Dame la base del triángulo");
         base= lectura.nextInt();
        System.out.println("Dame la altura de triángulo");
        altura= lectura.nextInt();
        superficie= (base*altura)/2;
        
        System.out.println("La supoerficie del triángulo es "+ superficie);
           
    }
    
}
