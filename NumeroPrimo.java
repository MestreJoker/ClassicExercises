package classicos;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		 Scanner in= new Scanner (System.in);
	        int numero;
	        int i=2;
	        System.out.println("Digite um numero para saber se e primo ou n�o:");
	        numero=in.nextInt ();
	        while (i<2 ) {
	            if ( numero % i == 0 ) {
	                System.out.println("O numero n�o e primo!");
	            }else {
	        }
	    }
	        i = i + 1; 
	        System.out.println ("O numero e primo!");

	}

}
