package com.mycompany.mavenrechner;

import java.util.Scanner;

/**
 * Taschenrechner mit den 4 Grundrechnungsarten im Maven Projekt
 * @author Maria Rasch
 * @version 1.0
 */
public class Rechner {
    
    private static double zahl1;
    private static double zahl2;
    private static String operator;
    private static double erg;
    /**
     * Konstruktor
     */
    public Rechner()
    {}
    
    
    /**
     * Main Methode des Rechners 
     * @param zahl1 ist die erste Zahl zum Rechnen
     * @param zahl2 ist die zweite Zahl zum Rechnen
     * @param operator ist der Operator um zu erkennen was genau gerechnet werden sollte
     */
    
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bitte geben sie eine Zahl (Kommastellen mit Komma trennen nicht mit Punkt) ein: ");
        zahl1 = scan.nextDouble();
        System.out.println("Bitte geben sie einen Operator ein: ");
        operator = scan.next();
        System.out.println("Bitte geben sie eine weitere Zahl(Kommastellen mit Komma trennen nicht mit Punkt) ein: ");
        zahl2 = scan.nextDouble();
        
        Rechner rechner = new Rechner();
        
        switch(operator)
        {
            case "+":
                rechner.addieren(zahl1, zahl2);
                rechner.ergAusgeben(erg);
            break;
            
            case "-":
                rechner.subtrahieren(zahl1, zahl2);
                rechner.ergAusgeben(erg);
            break;
            
            case "*":
                rechner.multiplizieren(zahl1, zahl2);
                rechner.ergAusgeben(erg);
            break;
            
            case "/":
                rechner.dividieren(zahl1, zahl2);
                rechner.ergAusgeben(erg);
            break;
            default:
                System.out.println("Sie haben einen ungültigen Operator eingegeben! Bitte starten sie das Programm neu");
            break;
        }
    }
   
    public double addieren(double z1, double z2)
            {
                erg = z1 + z2;
                return erg;
            }
    
    public double subtrahieren(double z1, double z2)
            {
                erg = z1 - z2;
                return erg;
            }
    
    public double multiplizieren(double z1, double z2)
            {
                erg = z1 * z2;
                return erg;
            }
    
    public double dividieren(double z1, double z2)
            {
                erg = z1 / z2;
                return erg;
            }
    
    public void ergAusgeben(double erg)
    {
        System.out.println(" = " + erg);
    }
}