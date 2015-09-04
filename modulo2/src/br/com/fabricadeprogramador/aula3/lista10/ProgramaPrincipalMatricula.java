package br.com.fabricadeprogramador.aula3.lista10;

import java.util.Date;
import java.util.Scanner;

public class ProgramaPrincipalMatricula {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qtq de Matriculas:");
		int qtd = leitor.nextInt();
		
		
		// Internamente já cria um vetor de 3 posicoes
		GerenciadorMatricula gm = new GerenciadorMatricula(qtd);
		//gm.setQtdMatriculas(qtd);
		
		// Cadastrando 3 matriculas
		for (int i = 0; i < gm.getQtdMatriculas(); i++) {

			Curso c = new Curso();
			System.out.println("Nome do Curso:");
			c.setNome(leitor.next());
			System.out.println("Carga Horária do Curso:");
			c.setCargaHoraria(leitor.nextInt());

			Aluno a = new Aluno();
			System.out.println("Codigo do Aluno:");
			a.setCodigo(leitor.nextInt());
			System.out.println("Nome do Aluno:");
			a.setNome(leitor.next());

			Matricula m = new Matricula();
			m.setAluno(a);
			m.setCurso(c);
			m.setData(new Date());

			gm.cadastrar(m);

		}

		// Busca

		System.out.println("Deseja buscar por aluno(1) ou curso(2)?");
		int opcao = leitor.nextInt();
		Matricula[] matbusca = null ;
		
		if(opcao==1){
			System.out.println("Digite o código do aluno para Busca:");
			Aluno alunoBusca = new Aluno();
			alunoBusca.setCodigo(leitor.nextInt());
			matbusca = gm.buscarMatriculas(alunoBusca);
		}else if (opcao==2){
			System.out.println("Digite o NOME do Curso para Busca:");
			Curso cursoBusca = new Curso();
			cursoBusca.setNome(leitor.next());
			matbusca = gm.buscarMatriculas(cursoBusca);
		}
		
		
		for (int i = 0; i < matbusca.length; i++) {
			// Se tiver na posicao nula o laço é interrompido
			if (matbusca[i] == null) {
				break;
			}
			System.out.println("Aluno:" + matbusca[i].getAluno().getNome() 
					+ " Cod mat:" + matbusca[i].getCodigo() + " Curso:"
					+ matbusca[i].getCurso().getNome());
		}
		
		leitor.close();

	}

}
