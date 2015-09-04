package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

/**

  @author Virmerson
 
 Faça um programa que leia 2 números inteiros e imprima qual é o maior entre eles.
 
 
 */
public class ProgramaPrincipalMaior {
	

	public static void main(String[] args) {
		//Objeto para leitura de dados
		Scanner leitor = new Scanner(System.in); 
		
		System.out.println("Digite n1:");
		int n1=leitor.nextInt();
		System.out.println("Digite n2:");
		int n2=leitor.nextInt();
		
		int maior;
		
		if(n1>n2){
			maior = n1;
			System.out.println("Maior:"+ maior);
		}else if (n1<n2){
			maior =n2;
			System.out.println("Maior:"+ maior);
		}else {
			System.out.println("São iguais!");
		}
		
		

		leitor.close();
	}
	
	
		
	}

