package classicos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int termo, n1=1,n2=0;


		System.out.println("Digite o termo");
		termo = leia.nextInt();
		System.out.println("A sequ�ncia de Fibonaci com o termo desejado �: ");
		System.out.print(n1+" ");
		
	    for(int i = 1 ; i<termo; i++){
	    n1 = n1 + n2;
	    n2 = n1 - n2;
	    System.out.print(n1+" ");
}









	}

}
