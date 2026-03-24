package Partie4;

import java.util.Scanner;

public class EX13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir un mot");
        String chaine = sc.next();
        String inverse="";
        for(int i = chaine.length()-1; i>=0; i--) {
        	inverse = inverse + chaine.charAt(i);
        	
        }
        System.out.println("le mot inversé est:"+inverse);
        
sc.close();
}
  }
