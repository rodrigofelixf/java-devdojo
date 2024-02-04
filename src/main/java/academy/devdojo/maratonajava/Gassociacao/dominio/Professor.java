package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Professor {
    private String name;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    public Professor(String name, String especialidade, Seminario[] seminarios) {
        this.name = name;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------");
        System.out.println("Professor: " + this.name);
        if (this.seminarios == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getName() + " idade: " + aluno.getAge());
            }
        }

    }
}
