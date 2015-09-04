package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cliente;



public class ProgramaPrincipalAula02 {

	public static void main(String[] args) {
		//Declaracao 
		Cliente c1, c2, c3;
		
		//Instanciamento
		c1 = new Cliente();
		c1.nome="Jão";
		c1.rg="0008281 SSP/MS";
		c1.cpf="90909909";
		c1.altura=1.75;
		c1.peso=70.0;
		c1.ativado=true;
		c1.estadoCivil= EstadoCivil.CASADO;
		c1.sexo = Sexo.MASC;
		
		c2 = new Cliente();
		
		c3 = new Cliente();
		
		//Declara e instancia
		Cliente c4 =  new Cliente();
		
		//instanciando calculadora
		
		Calculadora calc = new  Calculadora();
		Double soma = calc.somar(10.0, 2.0);
		System.out.println("Soma:" +soma);
		
		Double sub = calc.subtrair(10.0, 2.0);
		System.out.println("Subtração:"+ sub);
		
		Double div =  calc.dividir(10.0d,2.0d);
		System.out.println("Divisão:"+ div);
		
		Double mult = calc.multiplicar(10d, 2d);
		System.out.println("Multiplicação:" +mult);
		
		//Estudando métodos
		
		String nome = new String("a");
		//char letra = nome.charAt(1);
		//boolean vazio = nome.isEmpty();
		int tamanho = nome.length();
		System.out.println(tamanho);
		
	}

}
