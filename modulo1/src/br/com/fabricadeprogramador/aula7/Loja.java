package br.com.fabricadeprogramador.aula7;

public class Loja {
	/*private Cliente clientes[];// vetor 
	int numeroEntradas=0; // variavel do tipo int armazena a quantidade de clientes a serem adicionados 
	// metodo adicionar clientes
	public void adicionarCliente(Cliente novoCliente){// recebe como parametro de entrada um objeto do tipo cliente
		if(numeroEntradas<clientes.length){// se numero de entradas for menor q o tamanho do vetor
			clientes[numeroEntradas] = novoCliente;// o vetor na posiçao numero de entradas recebe o objto novo cliente
			numeroEntradas++; // passa para a proxima posiçao 
		}
	}
	public void imprimirTodos(){//
		for(int i=0; i < clientes.length ; i++){ // para i = o ate i menor q o vetor acrescente 1 ou passe para o seguinte
			// imprima o cliente da posiçao atual com nome sexo e idade
			System.out.println(clientes[i].getNome() + " " +clientes[i].getSexo() + " "+ clientes[i].getIdade());
		}
	}
	// metodo para criar vetor com a quantidade de clientes a serem inseridos 
	public void setQuantidadeClientes(int qtd) { // recebe como parametro objeto do tipo inteiro 
		clientes = new Cliente[qtd];// clientes é o vetor q recebe um objeto do tipo cliente e onde deveria estardefinido o tamanho do vetor se coloca a variavel qtd q armazena o numero q o ususario digitou 
	}
	// metodo para imprimir apneas mulheres
	public void imprimirClientesMulheres(){
		for (int i=0; i<clientes.length; i++){// para i = o ate i menor q o vetor acrescente 1 ou passe para o seguinte
			if(clientes[i].getSexo()=='f'){ // se o sexo do cliente na posiçao i for = f
				System.out.println(clientes[i].getNome());// imprima o cliente na posiçao atual com o nome 
			}
		}
		
	}
}*/
	
	private Cliente clientes [];
	int numeroEntradas=0;
	
	
	
	public void adicionarCliente(Cliente novoCliente){
		if (numeroEntradas<clientes.length){
			clientes[numeroEntradas]=novoCliente;
			numeroEntradas ++;
		}
	
	}
	
	public void imprimirTodos(){
		for (int i=0 ; i < clientes.length ; i++){
			System.out.println(clientes[i].getNome() + clientes[i].getSexo() + clientes[i].getIdade() );
		}
	}public void setQuantidadeClientes(int qtd){
		clientes = new Cliente[qtd]; // clientes é o vetor q recebe um objeto do tipo cliente e onde deveria estardefinido o tamanho do vetor se coloca a variavel qtd q armazena o numero q o ususario digitou
	}
	public void imprimirClientesMulheres(){
		for (int i=0; i<clientes.length; i++){
			if (clientes[i].getSexo()=='f'){
				System.out.println(clientes[i].getNome());
			}
		}
	}
	public void imprimirClientesAcima50Anos(){
		for (int i=0 ; i< clientes.length ; i++){
			if (clientes[i].getIdade() > 50){
				System.out.println(clientes[i].getNome());
			}
		}
	}
	public void imprimirClientesHomens(){
		for(int i=0 ; i<clientes.length;i++){
			if (clientes[i].getSexo()=='m'){
				System.out.println(clientes[i].getNome());
					
			}
		}
		
	}
	public void imprimirHomensAcimad20Anos(){
		for (int i=0 ; i<clientes.length;i++){
			if(clientes[i].getSexo()=='m' && clientes[i].getIdade() > 20){
				System.out.println(clientes[i].getNome());
				
			}
		}
		
	}
	
	
}
