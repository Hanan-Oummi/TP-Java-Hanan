package Partie4;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot");
        String mots = sc.next();
        int compteur=0;
       for(int i=0; i<mots.length(); i++) {
    	   if("aeiouy".contains(String.valueOf(mots.charAt(i)))) {  //mots.charAt(i) → récupère une lettre String.valueOf(...) → transforme en String (car contains prend une String)
    		   compteur++;
    	   }
    	   
       }
     System.out.println(compteur); 
        
sc.close();
}
    }
