package br.com.fabricadeprogramador.aula2;

import java.util.Scanner;

public class Calculadora {
	
	Double somar (Double n1, Double n2){
		return n1+n2;
	} 
	
	Double subtrair(Double n1, Double n2){
		return n1-n2;
	}
	
	Double multiplicar(Double n1, Double n2){
		return n1 * n2;
	}
	
	public Double dividir (Double n1, Double n2){
		Double divisao=null;
		if(n1>0 && n2>0){
			divisao = n1/n2;
		}
		return divisao;
	}
	public boolean ehPar(int n){
		if(!(n%2==0) ){
			return false;
		}else{
			return true;
		}
	}
	/**
	 * Calcula as operações aritméticas básicas de soma, subtração, divisão e multiplicação
	 * @param n1 primeiro numero da operacao
	 * @param n2 segundo numero da operacao
	 * @param operacao  1-Somar , 2- Subtrair, 3- Dividir , 4 - Multiplicar
	 * @return resultado da operação
	 */
	public Double calcular(Double n1, Double n2, Integer operacao){
		Double calculo =null;
		
		if(operacao==1){
			calculo = somar(n1, n2);
		}else{
			if(operacao==2){
				calculo=  subtrair(n1, n2);
			}else{
				
				if(operacao==3){
					calculo=dividir(n1, n2);
				}else{
					calculo=multiplicar(n1, n2);
				}
			}
		}
		
		return calculo;
	} 
	
	
	
	public double media (int qtd){
		Scanner leitor = new Scanner(System.in);
		double n, soma=0, media;
		
		//Processsamento
		for (int i=0;i<qtd;i=i+1){
				//Entrada
				System.out.println("N"+ (i+1)  +":");
				n = leitor.nextDouble(); //( 10 20 5 5 10) =50
				soma = soma + n; //Somando valor atual da soma com o n digitado
		}
				
		media = soma /qtd;
		leitor.close();
		return media;
		
	}

	public void maiorMenor(int qtd) {
		Scanner leitor = new Scanner(System.in);
		int n;
		int maior=0;
		int menor=0;
		
		//Loop de qtd vezes
		for (int i=0; i<qtd ; i=i+1){
			
			System.out.println("Digite N"+(i+1)+":");
			n=leitor.nextInt();
			//É o primero número
			if (i==0){
				maior = n;
				menor = n;
			}
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
	
	public void maiorMenorMedia(int qtd) {
		Scanner leitor = new Scanner(System.in);
		int n;
		int maior=0;
		int menor=0;
		int soma=0;
		double media;
		//Loop de qtd vezes
		for (int i=0; i<qtd ; i=i+1){
			System.out.println("Digite N"+(i+1)+":");
			n=leitor.nextInt();
			//Acumulador
			soma = soma + n;
			//É o primero número
			if (i==0){
				maior = n;
				menor = n;
			}
			if(n>maior){
				maior = n;
			}
			if (n<menor){
				menor = n;
			}
		}
		media = soma / qtd;
		System.out.println("Maior:"+ maior + " Menor:"+ menor + " Média:"+media);
		leitor.close();
	}

	public void multOperacoes() {
		Scanner leitor = new Scanner(System.in);
		int sair;
		
		do{
			
			System.out.println("N1:");
			Double n1 = leitor.nextDouble();
			System.out.println("N2:");
			Double n2= leitor.nextDouble();
			System.out.println("1-Somar , 2- Subtrair, 3- Dividir , 4 - Multiplicar");
			Integer operacao =leitor.nextInt();
			
			double res = calcular(n1, n2, operacao);
			System.out.println("Resultado:"+ res);
			
			System.out.println("Deseja Fazer Nova Operação? 0-Sair, 1-Continuar");
			sair = leitor.nextInt();
		}while (sair!=0);
		System.out.println("Encerrado!");
		leitor.close();
		
	}
}
