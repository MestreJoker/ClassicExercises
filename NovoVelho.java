package classicos;
import java.util.Scanner;

public class NovoVelho {

	public static void main(String[] args) {

				Scanner leia = new Scanner (System.in);
				int i, idade, velho=1, novo=1, media=0;
				
				for (i=1; i<=10; i++) {
					System.out.println("Informe a idade do "+i+"� usu�rio");
					idade = leia.nextInt();
					media = media+idade;
					if(idade>velho) {
						velho=idade;
					}
					else if(idade<novo) {
						novo=idade;
					}
					
				}
				media = media/10;
				System.out.println("A m�dia das idades �: "+media);
				System.out.println("O mais velho tem "+velho+" anos");
				System.out.println("O mais novo tem "+novo+" anos");
			}
	
	}

