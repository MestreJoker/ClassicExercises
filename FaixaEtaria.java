package classicos;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int idade, faixa1=0, faixa2=0, faixa3=0, faixa4=0, faixa5=0, soma, i;
		
		for(i=1;i<=15;i++) {
			System.out.println("Informe a idade do "+i+"� usu�rio");
			idade=leia.nextInt();
			
			if(idade<=15) {
				faixa1 = faixa1+1;
			}
			else if(idade>=16&&idade<=30) {
				faixa2 = faixa2+1;
			}
			else if(idade>=31&&idade<=45) {
				faixa3 = faixa3+1;
			}
			else if(idade>=46&&idade<=60) {
				faixa4 = faixa4+1;
			}
			else {
				faixa5 = faixa5+1;
			}
			
		}
		soma = faixa1+faixa2+faixa3+faixa4+faixa5;
		System.out.print("H� "+faixa1+" pessoas com a 1� faixa et�ria");
		faixa1 = faixa1*100/soma;
		System.out.println("com "+faixa1+"% do total");
		
		
		System.out.print("H� "+faixa2+" pessoas com a 2� faixa et�ria");
		faixa2 = faixa2*100/soma;
		System.out.println(" com "+faixa2+"% do total");
		
		System.out.print("H� "+faixa3+" pessoas com a 3� faixa et�ria");
		faixa3 = faixa3*100/soma;
		System.out.println(" com "+faixa3+"% do total");
		
		System.out.print("H� "+faixa4+" pessoas com a 4� faixa et�ria");
		faixa4 = faixa4*100/soma;
		System.out.println(" com "+faixa4+"% do total");
		
		System.out.print("H� "+faixa5+" pessoas com a 5� faixa et�ria");
		faixa5 = faixa5*100/soma;
		System.out.println(" com "+faixa5+"% do total");
	}

}
