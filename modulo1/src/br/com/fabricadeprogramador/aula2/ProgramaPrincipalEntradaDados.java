package br.com.fabricadeprogramador.aula2;

import java.util.Scanner;

public class ProgramaPrincipalEntradaDados {

	public static void main(String[] args) {
		
		//Entrada de dados pelo teclado
		Scanner leitor = new Scanner(System.in);
		
		//Saída
		System.out.println("Nome:");
	
		//Entrada
		String textoDigitado = leitor.next();
		
		//Saída
		System.out.println("Você Digitou:" + textoDigitado.toUpperCase());
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite n1:");
		Double n1 = leitor.nextDouble(); //leitura (entrada)
		
		System.out.println("Digite n2:");
		Double n2 = leitor.nextDouble(); //leitura (entrada)
		
		Double s = calc.somar(n1, n2); //calculo (processamento)
		
		System.out.println("A soma é: " + s); //impressao (saida)
		//Encerramento do objeto
		leitor.close();
	}

}
