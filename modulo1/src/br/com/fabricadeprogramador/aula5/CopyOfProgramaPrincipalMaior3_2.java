package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

/**

  @author Virmerson
 
 Faça um programa que leia 3 números inteiros e imprima qual é o maior entre eles.
 
 
 */
public class CopyOfProgramaPrincipalMaior3_2 {

	public static void main(String[] args) {
		//Objeto para leitura de dados
		Scanner leitor = new Scanner(System.in); 
		
		System.out.println("Digite n1:");
		int n1=leitor.nextInt();
		
		System.out.println("Digite n2:");
		int n2=leitor.nextInt();

		System.out.println("Digite n3:");
		int n3=leitor.nextInt();
		
		int maior;
		int menor;
		//Maior
		if(n3>n2 && n3>n1){
			maior = n3;
		}else if (n2>n1 && n2> n3 ){
			maior =n2;
		}else {
			maior = n1;
		}
		//Menor
		if(n3<n2 && n3<n1){
			menor = n3;
		}else if (n2<n1 && n2< n3 ){
			menor =n2;
		}else {
			menor = n1;
		}
		
		System.out.println("Menor: "+ menor + " Maior:" + maior);

		leitor.close();
	}

}
