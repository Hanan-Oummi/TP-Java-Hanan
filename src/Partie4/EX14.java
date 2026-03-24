package Partie4;

import java.util.Scanner;

public class EX14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir un mot");
        String chaine = sc.next();
        boolean estPalindrome = true;

        for(int i = 0; i < chaine.length() / 2; i++) {
            if(chaine.charAt(i) != chaine.charAt(chaine.length() - 1 - i)) {
                estPalindrome = false;
            }
        }

        if(estPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("pas palindrome");
        }
        sc.close();
	}
}
