package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

import br.com.fabricadeprogramador.aula2.Calculadora;

public class ProgramaPrincipalMaior10_3 {

	public static void main(String[] args) {
		
		//Leitura
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qtd Numeros:" );
		int qtd = leitor.nextInt();
		
		//Processamento
		Calculadora calc = new Calculadora();
		//calc.maiorMenor(qtd);
		
		calc.maiorMenorMedia(qtd);
		
		leitor.close();
	}

}
