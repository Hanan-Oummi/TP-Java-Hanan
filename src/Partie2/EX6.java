package Partie2;

import java.util.Arrays;
import java.util.Scanner;

public class EX6 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] nombres = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 System.out.println(Arrays.toString(nombres));
		 System.out.println("Veuillez saisir le nombre");
		 int nbr = sc.nextInt();
		
		 for(int i=0; i<10; i++) {
			 if(nbr==nombres[i]) {
			System.out.println("la position de ce nombre est:" +i);
			 }
		 }
		 
   sc.close();
}
    }
