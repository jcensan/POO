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
public class Problema2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        double tipoCambio, peso, dolar;
        System.out.println("Programa que convierte de pesos a dolar");
        System.out.println("Tipo de cambio peso-dolar");
        tipoCambio= lectura.nextDouble();
        System.out.println("Dame la cantidad de pesos a convertir");
        peso= lectura.nextDouble();
        dolar= peso/tipoCambio;
        
        System.out.println("Cantidad " + peso + " otorga "+ dolar + " dolares ");
        
    
        
        
        
    }
}
