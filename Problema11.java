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
public class Problema11 {
    public static void main(String[] args) {
        double a, b, temporal;
       Scanner lectura= new Scanner(System.in);
        System.out.println("Dame el número a ");
        a= lectura.nextDouble();
        System.out.println("Dame el número b");
        b= lectura.nextDouble();
        
        
        
        while (b!=0)
        {
          temporal=b;
          b= a%b;
          a= temporal;
        }
       
        System.out.println("El MCD de los números es " + a);
    }
}
