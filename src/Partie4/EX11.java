package Partie4;

import java.util.Scanner;

public class EX11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot");
        String mot = sc.next();
        System.out.println("la longueur de mot que avez saisi est:");
        int longueur = mot.length();
        System.out.println(longueur);
sc.close();
   }
}
