package br.com.fabricadeprogramador.aula4;

import java.util.Scanner;

import br.com.fabricadeprogramador.aula2.Calculadora;

public class EstruturaRepeticao2 {
	public static void main(String[] args) {
		
		double  mediaResposta; //declaracao 
		
		//Entrada
		Scanner leitor = new Scanner(System.in);
		System.out.println("Média de Quantos Números?");
		int qtd = leitor.nextInt();
		
		//Processamento
		Calculadora calc = new Calculadora();
		mediaResposta = calc.media(qtd);
		
		//Saída
		System.out.println("Media:" + mediaResposta);
		
		leitor.close();
	}
}
