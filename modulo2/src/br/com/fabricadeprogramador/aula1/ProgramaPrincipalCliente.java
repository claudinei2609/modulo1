package br.com.fabricadeprogramador.aula1;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {
		//Instancia de Estado
		
		Estado ms = new Estado();
		ms.setNome("Mato Grosso do Sul");
		ms.setUf("MS");
		
		
		//Instancia de Cidade
		Cidade cg =  new Cidade();
		cg.setNome("Campo Grande");
		//cg.setEstado(ms); //Relacionamento de cidade com objeto Estado
		
		//Instancia de Cliente
		Cliente c1 = new Cliente();
		c1.setNome("Jao");
		c1.setRg("9999");
		c1.setCpf("9090909");
		
		//Relacionamento do objeto cliente com o objeto cidade
		c1.setCidade(cg);
		
		//Instancia de Cliente
		Cliente c2 = new Cliente();
		c2.setNome("Maria");
		c2.setCidade(cg); //relacionamento

		//Instancia de Cliente
		Cliente c3 = new Cliente();
		c3.setNome("José");
		c3.setCidade(cg); //relacionamento

		System.out.println(c1.getNome() + " " + c1.getCidade().getNome()+ " "+c1.getCidade().getEstado().getNome());
		System.out.println(c2.getNome() + " " + c2.getCidade().getNome());
		System.out.println(c3.getNome() + " " + c3.getCidade().getNome());
				
	}
}
