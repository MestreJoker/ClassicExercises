package classicos;

public class Tabuada {

	public static void main(String[] args) {
		for (int I = 1; I < 11; I++){ 
			System.out.println("\nTabuada do "+I); 
			for (int N = 0; N <= 10; N++){ 
				System.out.println(I+" x "+N+" = "+I*N);
			}
		}
	}

}
