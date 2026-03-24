package Partie1;

import java.util.Scanner;

public class EX1 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un nombre");
			int nombre = sc.nextInt();
			if(nombre>0) {
				System.out.println("Ce nombre est positif");
			}
			else if(nombre<0) {
				System.out.println("Ce nombre est négatif");
			}
			else {
				System.out.println("Ce nombre est nul");
			}
			sc.close();
			
			
		}
}
