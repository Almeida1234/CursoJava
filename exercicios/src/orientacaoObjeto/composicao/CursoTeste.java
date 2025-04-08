package orientacaoObjeto.composicao;

public class CursoTeste {
	
public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Alexandre");
		Aluno aluno2 = new Aluno("Camily");
		Aluno aluno3 = new Aluno("Cecilia");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Pedagogia");
		Curso curso3 = new Curso("Química");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso1);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso "
					+ curso1.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso "
					+ curso2.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso "
					+ curso3.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		System.out.println("===================================");
		System.out.println();
		
		System.out.println(aluno1.cursos.get(0).alunos);
		System.out.println(aluno1.cursos.get(1).alunos);
		System.out.println(aluno1.cursos.get(2).alunos);
		System.out.println(aluno2.cursos.get(0).alunos);
		System.out.println(aluno2.cursos.get(1).alunos);
		System.out.println(aluno2.cursos.get(2).alunos);
		System.out.println(aluno3.cursos.get(0).alunos);
		System.out.println(aluno3.cursos.get(1).alunos);
		System.out.println(aluno3.cursos.get(2).alunos);
		
		System.out.println();
		System.out.println("===================================");		
		System.out.println();
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		Curso cursoEncontrado1 = aluno2.obterCursoPorNome("Química");
		Curso cursoEncontrado2 = aluno3.obterCursoPorNome("Pedagogia");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
			System.out.println();
		}
		if(cursoEncontrado1 != null) {
			System.out.println(cursoEncontrado1.nome);
			System.out.println(cursoEncontrado1.alunos);
			System.out.println();
		}
		if(cursoEncontrado2 != null) {
			System.out.println(cursoEncontrado2.nome);
			System.out.println(cursoEncontrado2.alunos);
			System.out.println();
		}
	}
}
