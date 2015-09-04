package br.com.fabricadeprogramador.aula4;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		
		double n1, n2, n3, media; //declaracao 
		
		Scanner leitor = new Scanner(System.in);
		//Entrada
		System.out.println("N1:");
		n1 = leitor.nextDouble();
		
		System.out.println("N2:");
		n2 = leitor.nextDouble();
		
		System.out.println("N3:");
		n3 = leitor.nextDouble();
		
		//Processsamento
		
		media = (n1+n2+n3) /3;
		
		//Saída
		System.out.println("Media:" + media);
		
	}

}
