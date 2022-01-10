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
public class Problema1 {
    
    public static void main(String[] args) {
          Scanner lectura = new Scanner(System.in);
          int gradosC;
          double gradosF;
          System.out.println("Dame los grados centigrados a convertir: ");
          gradosC= lectura.nextInt();
          gradosF= 32 +(1.8 * gradosC);
          System.out.println("ºC "+ gradosC + " a" + " ºF " + gradosF);
           
    }
    
}
