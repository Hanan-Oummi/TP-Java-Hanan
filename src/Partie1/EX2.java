package Partie1;
import java.util.Scanner;
public class EX2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Saisir premeir nombre");
		 int a = sc.nextInt();
		 System.out.println("Saisir le deuxième nombre");
		 int b = sc.nextInt();
		 System.out.println("Saisir le troisième nombre");
		 int c = sc.nextInt();
		 int max=a;
		 if(b>max) {
			 max=b;
		 }
		 if(c>max) {
			 max=c;
		 }
		 System.out.println("le maximum est:"+max);
		 sc.close();;
		 
	}
	
}
