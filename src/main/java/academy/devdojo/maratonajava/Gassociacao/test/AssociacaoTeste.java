package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua da Rua Rua");
        Aluno aluno = new Aluno("Goku", 500);
        Professor professor = new Professor("Barba Branca", "Comunismo");
        Aluno[] alunosParaSeminario = {};
        Seminario seminario = new Seminario("Onde achar one piece", local, alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
