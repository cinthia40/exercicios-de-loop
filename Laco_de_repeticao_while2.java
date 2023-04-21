package laco_for;

import java.util.Scanner;

public class Laco_de_repeticao_while2 {

	public static void main(String[] args) {
		int idade,genero,cat,contNPBack=0,contNMFull=0,contHMais40=0,contMFull30=0;
		String escolha = "s";
		
		Scanner leia = new Scanner(System.in);
		
		while(escolha.equalsIgnoreCase("s")) {
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
			
			
			while(idade<0 || idade>140) {
				System.out.println("\nIdade Inválida. Digite novamente a idade: ");
				idade = leia.nextInt(); 
			}
			
			
			System.out.println("\nDigite o gênero: ");
			System.out.println("\n1 - Masculino\n2 - Feminino\n3 - Não se aplica");
			genero = leia.nextInt();
			
			
			while(genero<1 || genero>3) {
				System.out.println("\nGênero inválido. Digite novamente o seu gênero: ");
				System.out.println("\n1 - Masculino\n2 - Feminino\n3 - Não se aplica");
				genero = leia.nextInt();
			}
			
			
			System.out.println("\nDigite a categoria: ");
			System.out.println("\n1 - BACKEND\n2 - FrontEnd\n3- Mobile\n4 - FullStack");
			cat = leia.nextInt();
			
			
			while(cat<1 || cat>4) {
				System.out.println("\nCategoria inválida. Digite novamente a categoria: ");
				System.out.println("\n1 - BACKEND\n2 - FrontEnd\n3 - Mobile\n4 - FullStack");
				cat = leia.nextInt();
			}
			
			System.out.println("\nDeseja continuar??? (Digite S para SIM e N para NÃO)");
			escolha = leia.next();
			
			if(cat==1) {
				contNPBack++;
			}
			
			if(genero == 2 && cat == 2) {
				contNMFull++;
			}
			
			if(idade > 40 && genero == 1 && cat == 3) {
				contHMais40++;
			}
			
			if (idade < 30 && genero == 2 && cat == 4) {
				contMFull30++;
			}
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+contNPBack);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: "+contNMFull);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: "+contHMais40);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: "+contMFull30);

	}

}

