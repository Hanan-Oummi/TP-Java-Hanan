package Partie2;

import java.util.Arrays;
import java.util.Scanner;

public class EX7 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] notes= new int[5];
		 for(int i=0; i<5; i++) {
		System.out.println("saisir l'élément"+ (i+1));
		notes[i]=sc.nextInt();
		 }
		 System.out.println("voici le tableau");
		 System.out.println(Arrays.toString(notes));
		 System.out.println("le maximum entre tout les éléments du tableau est:");
		 int max=notes[0];
		 for(int i=0; i<5; i++) {
			 if(notes[i]>max) {
				 max=notes[i];
			 }
			
		 }
		 System.out.println(max);
		 sc.close();
	}
}
