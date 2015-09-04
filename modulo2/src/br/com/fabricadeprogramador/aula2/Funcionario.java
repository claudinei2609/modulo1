package br.com.fabricadeprogramador.aula2;


public abstract class Funcionario extends Pessoa{
	
	private String cpf;
	private String rg;
	private String cargo;
	private double salario;
	
	public Funcionario() {
	}
	public Funcionario(String nome, String cpf, String rg,
			String cargo) {
		
		setNome(nome); //* classe base Pessoa
		setCpf(cpf);
		setRg(cargo);
		setCargo(cargo);
	}
	
	public Funcionario(String nome, String cpf, String rg,
			String cargo, double salario) {
		
		setNome(nome); //* classe base Pessoa
		setCpf(cpf);
		setRg(cargo);
		setCargo(cargo);
		setSalario(salario);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	//Sobrescrita do toString()
	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", rg=" + rg + ", cargo=" + cargo
				+ ", nome=" + getNome() + ", cidade=" + getCidade()
				+ "]";
	}
	//Declaracao de método abstrato
	public abstract double calcularSalario();
	
	public double calcularBonificacao(){
		return getSalario()+ 50;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
