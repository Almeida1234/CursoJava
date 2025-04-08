package orientacaoObjeto.composicao;

import java.util.ArrayList;

public class Curso {
	
	final String nome;
	
	final ArrayList<Aluno> alunos = new ArrayList<>();
	
	
	Curso(String nome){
		this.nome = nome;
	}
			
	void adicionarAluno(Aluno aluno) {
		// Adicionando o item à lista de itens
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	public String toString() {
		return nome;
	}
	
}
