package laco_for;

import java.util.Scanner;

public class Laco_de_repeticao_while {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		int idade,menor=0,maior=0;
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		while(idade != -1) {
			
			if(idade<21) {
				menor++;
			}
			
			else if (idade>50){
				maior++;
			}
			
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
			
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+menor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+maior);

	}

}
