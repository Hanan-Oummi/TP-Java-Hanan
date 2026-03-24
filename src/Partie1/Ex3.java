package Partie1;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir un nombre");
		int N = sc.nextInt();
		for(int i=1; i<11; i++) {
			System.out.println(N+ "*"+ i +"="+(N*i));
			
			
			
		}
		
  sc.close();
		
	}

}
