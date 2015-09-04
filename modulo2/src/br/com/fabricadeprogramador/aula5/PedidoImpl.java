package br.com.fabricadeprogramador.aula5;

public class PedidoImpl implements Pedido{
	private Integer codigo;
	private ItemPedido[] itens = new ItemPedido[3];
	@Override
	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public Double calcularValorTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarItem(ItemPedido itemPedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerItemPedido(ItemPedido itemPedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirItens() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemPedido[] ordenarItensPedido() {
		// Merge Sort
		//Insertion Sort
		//Bubble Sort
		return null;
	}

	@Override
	public ItemPedido[] getItensPedido() {
		return itens;
	}

}
