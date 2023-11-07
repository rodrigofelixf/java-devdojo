package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Seminario {
    private String titulo;

    private Local local;
    private Aluno[] alunos;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }


    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }
    public Seminario(String titulo, Local local, Professor[] professors) {
        this.titulo = titulo;
        this.local = local;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
