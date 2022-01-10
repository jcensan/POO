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
public class Problema3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        double tipoCambio, peso, dolar;
        System.out.println("Programa que convierte de dolar  a peso");
        System.out.println("Tipo de cambio peso-dolar");
        tipoCambio= lectura.nextDouble();
        System.out.println("Dame la cantidad de dolares a convertir a pesos");
        dolar= lectura.nextDouble();
        peso= dolar*tipoCambio;
        
        System.out.println("Cantidad " + dolar + " otorga "+ peso + " pesos ");
        
    }
}
