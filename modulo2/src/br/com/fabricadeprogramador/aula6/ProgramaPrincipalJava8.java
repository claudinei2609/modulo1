package br.com.fabricadeprogramador.aula6;

public class ProgramaPrincipalJava8 {

	public static void main(String[] args) {
		//Instancia comum
		Calculadora calc1 = new CalculadoraCientifica();
		double s1 = calc1.somar(10, 20);
		System.out.println(s1); //30
		
		//Instancia anonima
		Calculadora calc2 = new Calculadora() {
			@Override
			public double somar(double n1, double n2) {
				return n1+n2;
			}
		};
		double s2 = calc2.somar(40, 50);
		System.out.println(s2); //90
		//Instancia por meio do Lambda java > 1.8
		
		Calculadora calc3 = (n1, n2)->{return n1+n2;};
		double s3 = calc3.somar(30, 30); //60
		System.out.println(s3);
	}
}
