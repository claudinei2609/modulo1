package br.com.fabricadeprogramador.aula7;

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		// leitor de entradas de dados 
		Scanner leitor = new Scanner(System.in);
		// criaçao de objeto do tipo loja 
		Loja lojinhaDaMaria =  new Loja();
		//pede a quantidade de clientes  a serem cadastrados
		System.out.println("Qtd de Clientes:");
		//atribui a variavel qtd o q o usuario digitou
		int qtd = leitor.nextInt();
		// invocando metodo de criaçao de vetor com a quantidade q o usuario digitou
		lojinhaDaMaria.setQuantidadeClientes(qtd);
		//Cadastro
		for (int i =0 ; i<qtd; i++){// para i = 0 ate i menor q a quantidade de posiçoes informada pelo usuario faça 
			Cliente cli = new Cliente();// criaçao do objeto do tipo cliente 
			System.out.println("Nome:");// pedindo para digitar nome 
			cli.setNome (leitor.next());//atribuindo ao cliente na propriedade nome o q o cli digitou
			System.out.println("Sexo:");// pedindo para digitar sexo
			cli.setSexo(leitor.next().toLowerCase().charAt(0));// atribuindo o texto digitado ao objeto cliente convertendo para minusculo e pegando o apenas a primeira letra 
			System.out.println("Idade:");// pedindo para digitar idade
			cli.setIdade(leitor.nextInt());//atribuindo ao cliente na propriedade idade o q o cli digitou
			
			lojinhaDaMaria.adicionarCliente(cli);// adicionando o objeto cliente na loja atraves do metod adicionar cliente
		}
		System.out.println("1 -Imprimir Todos 2-Imprimir Mulheres 3-imprimir Acima de 50 Anos 4-imprimir clientes homens 5- imprimir Homens acima de 20 Anos ");//opçoes para o usuario
		int opcao = leitor.nextInt();// atribuiçao na variavel opçao o texto digitado
		if(opcao==1){// se opçao = 1
			lojinhaDaMaria.imprimirTodos();// lojinha chama metodo imprimir todos 
		}else if(opcao==2){ // se opçao = 2 
			lojinhaDaMaria.imprimirClientesMulheres();// lojinha chama metodo imprimir mulheres 
		}
		else if (opcao==3){
			lojinhaDaMaria.imprimirClientesAcima50Anos();
		}
		else if(opcao==4){
			lojinhaDaMaria.imprimirClientesHomens();
		}
		else if (opcao==5){
			lojinhaDaMaria.imprimirHomensAcimad20Anos();
			
		}
		leitor.close();// fechamento de leitor 
	
	
	}
	
}
