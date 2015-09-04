package br.com.fabricadeprogramador.aula5;

public class Curso implements ItemPedido {
	private Integer codigo;
	private Double valor;
	private String descricao;
	
	// Outras
	private String conteudo;
	private String publicoAlvo;
	private Integer cargaHoraria;
	public Integer getCodigo() {
		
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
		
	}
	public Double getValor() {
		
		return valor;
	}
	public void setValor(Double valor) {
		this.valor=valor;
		
	}
	public String getDescricao() {
		
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao =  descricao;
	}
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
