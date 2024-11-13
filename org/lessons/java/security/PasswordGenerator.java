package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
        System.out.println("inserire il nome: ");
        String name = dati.nextLine();
        
        System.out.println("inserire il cognome: ");
        String cognome = dati.nextLine();
        
        System.out.println("inserire il colore preferito: ");
        String color = dati.nextLine();
        
        System.out.println("inserire il giorno della tua nascita: ");
        int day = dati.nextInt();
        
        System.out.println("inserire il mese della tua nascita: ");
        int month = dati.nextInt();
        
        System.out.println("inserire l'anno della tua nascita: ");
        int year = dati.nextInt();
        
        int finalDate = day + month + year;

        System.out.println("La tua password sicurissima è " + name + "-" + cognome + "-" + color + "-" + finalDate );
        dati.close();
    }

}
