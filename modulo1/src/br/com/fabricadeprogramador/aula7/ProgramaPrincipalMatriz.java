package br.com.fabricadeprogramador.aula7;

import java.util.Scanner;

public class ProgramaPrincipalMatriz {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double notas[][] = new double[2][3];
		
		//Entrada
		for (int linha=0; linha<notas.length; linha++){
			for (int coluna=0; coluna<notas[linha].length; coluna++){
				System.out.println("Nota["+ linha   +"]["+coluna+  "]:");
				notas[linha][coluna] = leitor.nextDouble();
			}
		}
		double soma =0.0;
		//Saída
		for (int linha=0; linha<notas.length; linha++){
			for (int coluna=0; coluna<notas[linha].length; coluna++){
				soma = soma + notas[linha][coluna]; 
				System.out.println("Nota["+linha+"]["+coluna+"]=" + notas[linha][coluna] );
			}
		}
		double media= soma/ (notas.length * notas[0].length);
		
		System.out.println("Media:"+ media);
		leitor.close();
	}
}
