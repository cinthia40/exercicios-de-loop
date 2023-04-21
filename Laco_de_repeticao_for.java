package laco_for;

import java.util.Scanner;

public class Laco_de_repeticao_for {

	public static void main(String[] args) {
		
		int numero = 0, x, contPar = 0, contImpar = 0;
		
		Scanner leia = new Scanner (System.in);
	
			
			for (x=1;x<=10;x++) {
				
				System.out.println("Digite um número: ");
				numero = leia.nextInt();
				
				if (numero % 2 == 0) {
	                contPar += 1;
	                
	                
	            } else {
	                
	                contImpar += 1;
	                
	            }
				
	        }
			
	        System.out.println("Total de números pares: " +contPar);
	        System.out.println("Total de números ímpares: " + contImpar);
				
				
			}
		    
			
		}
	


