package br.com.fabricadeprogramador.aula5;

public class ProgramPrincipalPedido {

	public static void main(String[] args) {
		
		Pedido p1 = new PedidoImpl();
		
		ItemPedido livro =  new Livro();
		
		ItemPedido curso = new Curso();
		
		p1.adicionarItem(livro);
		p1.adicionarItem(curso);
		
		p1.imprimirItens();
		 

	}

}
