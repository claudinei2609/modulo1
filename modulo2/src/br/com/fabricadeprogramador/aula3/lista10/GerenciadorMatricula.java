package br.com.fabricadeprogramador.aula3.lista10;

public class GerenciadorMatricula {
	
	public GerenciadorMatricula() {
		// TODO Auto-generated constructor stub
	}
	public GerenciadorMatricula(int qtd) {
		setQtdMatriculas(qtd);
	}
	
	// Declaracao do Vetor
	private Matricula matriculas[] ; // 

	private Integer codSequencial = 1;
	private Integer pos = 0;

	public void cadastrar(Matricula mat) {
		// 1 -Atribui codigo na matricula
		Integer codigoSequencial = gerarCodigoSequencial();
		mat.setCodigo(codigoSequencial);

		// 2 - Adiciona no vetor na condicao de tamanho
		if (pos < matriculas.length) {
			matriculas[pos++] = mat;
		}
	}
	
	public Matricula[] buscarMatriculas(String nomeAluno, String nomeCurso ) {
		return null;
	}
	
	public Matricula[] buscarMatriculas(Integer codigoAluno) {
		return null;
	}
	//Sobrecarga de métodos
	public Matricula[] buscarMatriculas(Curso curso) {
		return null;
	}
	public Matricula[] buscarMatriculas(Aluno alunoBusca) {
		//Guardar o resultado
		Matricula matres[] = new Matricula[getQtdMatriculas()];
		int j=0;
		//Busca Linear
		for (int i = 0; i < getQtdMatriculas(); i++) {
			// Comparando o codigo do aluno da matricula com o codigo do aluno
			// da busca
			if (matriculas[i].getAluno().getCodigo() == alunoBusca.getCodigo()) {
				matres[j++] = matriculas [i];
			}
		}

		return matres;
	}

	private Integer gerarCodigoSequencial() {
		return codSequencial++;
	}

	public void setQtdMatriculas(int qtd) {
		matriculas = new Matricula[qtd];
	}

	public int getQtdMatriculas() {
		return matriculas.length;
	}
}
