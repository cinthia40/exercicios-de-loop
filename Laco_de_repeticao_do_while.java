package laco_for;

import java.util.Scanner;

public class Laco_de_repeticao_do_while {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
	        int soma = 0,numero = 0;
	        do{
	            
	            System.out.println("Digite um número: ");
	            numero=leia.nextInt();
	            
	            if (numero>0){
	            	soma += numero;
	            }

	        }while(numero != 0);

	        System.out.println("A soma dos números positivos é: "+soma);
	    }

}
