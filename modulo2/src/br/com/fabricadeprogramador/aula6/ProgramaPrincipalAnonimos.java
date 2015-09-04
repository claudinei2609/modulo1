package br.com.fabricadeprogramador.aula6;

import br.com.fabricadeprogramador.aula5.Curso;
import br.com.fabricadeprogramador.aula5.ItemPedido;
import br.com.fabricadeprogramador.aula5.Livro;
import br.com.fabricadeprogramador.aula5.Pedido;
import br.com.fabricadeprogramador.aula5.PedidoImpl;

public class ProgramaPrincipalAnonimos {

	public static void main(String[] args) {
		Pedido pedido = new PedidoImpl();
		
		ItemPedido javaOO = new Curso();
		ItemPedido livroJava = new Livro();
		
		ItemPedido mouse1 = new ItemPedido() {
			
			@Override
			public void setValor(Double valor) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDescricao(String descricao) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCodigo(Integer codigo) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Double getValor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getDescricao() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer getCodigo() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	
		
		pedido.adicionarItem(livroJava);
		pedido.adicionarItem(livroJava);
		
		
	}

}
