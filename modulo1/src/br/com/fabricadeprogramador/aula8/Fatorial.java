package br.com.fabricadeprogramador.aula8;

public class Fatorial {

	public int calcularFatorial(int n){
		if(n==0){
			return 1;
		}else{
			return n * calcularFatorial(n-1);
		}
	}
}

 