package Partie1;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Veuillez saisir un nombre entier");
		 int N = sc.nextInt();
		 int i = 1;
		 int som = 0;
		 while(i<=N) {
			 som = som+i;
			 i++;
		 }
		 System.out.println("la somme des N premier entier est:"+ som);
	
	sc.close();
}
     }
	