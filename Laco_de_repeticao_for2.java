package laco_for;

import java.util.Scanner;

public class Laco_de_repeticao_for2 {

	public static void main(String[] args) {
		
		int numero1,numero2,x;
		
		Scanner leia = new Scanner (System.in);
	
		
			System.out.println("Digite o primeiro número do intervalo: ");
			numero1 = leia.nextInt();
			System.out.println("Digite o último número do intervalo: ");
			numero2 = leia.nextInt();
		
			if (numero1>numero2 && numero2<numero1) {
				System.out.println("Intervalo Inválido!");
			}
			
			
			//intervalo de repetição onde x = numero1 é o começo do laço
			for (x=numero1;x<numero2;x++) {
				if (x%3 == 0 && x%5 == 0) {
                    System.out.println(x+" é multiplo de 3 e 5");
                }
			}
		

	}

}
