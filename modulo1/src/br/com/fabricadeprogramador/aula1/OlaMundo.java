package br.com.fabricadeprogramador.aula1;

public class OlaMundo {

	public static void main(String[] args) {
		
		//System.out.println("Olá Mundo!");
		
		//Instancia de carro
		Carro carro1 = new Carro(); //Copia da ficha em branco
		carro1.ano=1981;  //preenchendo os campos da ficha
		carro1.cor="Azul";
		carro1.marca="Wolks";
		carro1.modelo="Fusca";
		 
		Carro carro2 = new Carro(); //Copia em branco
		carro2.ano=2015; //preenchendo os campos
		carro2.cor="Branco";
		carro2.marca="Chevrolet";
		carro2.modelo="Cobalt";
		
		//Imprimindo os dados do objeto
		System.out.println("ANO:"+ carro1.ano + " COR:" + carro1.cor + " MARCA:"+carro1.marca + " MODELO:" + carro1.modelo);
		
	}

}
