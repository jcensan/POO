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
public class Problema6 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        double gramos, kilos, libras;
        System.out.println("Programa qe convierte de libras a kiligramos y gramos");
        System.out.println("Dame el peso en libras");
        libras= lectura.nextDouble();
        kilos= libras *.453592;
        gramos= kilos* 1000;
        System.out.println("El equivalente en Kg y gramos de " + libras+ " es " + kilos+ " Kg y " + gramos+ "gr");
        
    }
}
