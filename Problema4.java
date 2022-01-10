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
public class Problema4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opc=0;
        double tipoCambio=20, dolar, peso;
        
        while(opc!=4 )
        {
           
            System.out.println("1.-Tipo de cambio \n "+ "2.-Peso Dolar \n "+ "3.-Dolar Peso\n"+ "4- Salir \n"  );            
             opc = lectura.nextInt();
            switch (opc) {
            case 1:
            
            {System.out.println("Programa que convierte de pesos a dolar");
            System.out.println("Tipo de cambio peso-dolar");
             tipoCambio= lectura.nextDouble();
             break;
            
            }
            case 2:
            {
            System.out.println("Dame la cantidad de pesos a convertir");
            peso= lectura.nextDouble();
            dolar= peso/tipoCambio;
            System.out.println("Cantidad " + peso + " otorga "+ dolar + " dolares ");
            break;
            
            }
                
                
                
            case 3:{
            System.out.println("Dame la cantidad de dolares a convertir a pesos");
            dolar= lectura.nextDouble();
            peso= dolar*tipoCambio;
            System.out.println("Cantidad " + dolar + " otorga "+ peso + " pesos ");
            break;
            
            }
                
                
                
            default:
                    System.out.println("Opcion no válida");
                    
                throw new AssertionError();
        }
        
        
        }
        
    }
    
}
