package com.mycompany.mavenrechner;

import java.util.Scanner;

/**
 * Taschenrechner mit den 4 Grundrechnungsarten im Maven Projekt
 * @author Maria Rasch
 */
public class Rechner {
    
    public static double zahl1;
    public static double zahl2;
    public static String operator;
    
    public Rechner(double z1, double z2, String op)
    {
        zahl1 = z1;
        zahl2 = z2;
        operator = op;
    }
    
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bitte geben sie eine Zahl ein: ");
        zahl1 = scan.nextDouble();
        System.out.println("Bitte geben sie einen Operator ein: ");
        operator = scan.next();
        System.out.println("Bitte geben sie eine weitere Zahl ein: ");
        zahl2 = scan.nextDouble();
        
        switch(operator)
        {
            case "+":
                zahl1 = zahl1 + zahl2;
            break;
            
            case "-":
                zahl1 = zahl1 - zahl2;
            break;
            
            case "*":
                zahl1 = zahl1 + zahl2;
            break;
            
            case "/":
                zahl1 = zahl1 / zahl2;
            break;
        }
        System.out.println("=");
        System.out.println(zahl1);
    
    }
}
