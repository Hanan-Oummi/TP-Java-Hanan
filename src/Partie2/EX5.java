package Partie2;

import java.util.Arrays;
import java.util.Scanner;

public class EX5 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Veuillez saisir la taille du tableau");
		 int N = sc.nextInt();
		 int[] table = new int[N];
		 for(int i=0; i<N; i++) {
		System.out.println("saisir la valeur" +(i+1)+":");
		table[i] = sc.nextInt();
		 }
		 System.out.println("voici les élément tu tableau");
		 System.out.println(Arrays.toString(table));
		 
		 
sc.close();
}
   }
