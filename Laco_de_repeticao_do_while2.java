package laco_for;

import java.util.Scanner;

public class Laco_de_repeticao_do_while2 {

	public static void main(String[] args) {
		
		int numero=0,soma=0;
		float media = 0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero>0 && numero%3 == 0){
			media++;
			soma = soma + numero;
		}
		
		}while (numero != 0);
		System.out.println("A média de todos os números múltiplos de 3 é: "+(soma / media));
		

	}

}
