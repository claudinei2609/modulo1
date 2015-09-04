

package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

public class ProgramaPrincipalMaior10_2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n;
		int maior=0;
		int menor=Integer.MAX_VALUE;
		
		//Loop de 10 vezes
		for (int i=0; i<10 ; i=i+1){
			System.out.println("Digite N"+(i+1)+":");
			n=leitor.nextInt();
			if(n>maior){
				maior = n;
			}
			
			if (n<menor){
				
				menor = n;
			}
		}
		System.out.println("Maior:"+ maior + " Menor:"+ menor);
		leitor.close();
	
	
		
		
	}

}
