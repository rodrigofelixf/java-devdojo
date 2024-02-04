package academy.devdojo.maratonajava.Gassociacao.dominio;

public class School {
    private String name;
    private Professor[] professores;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Professor[] professores) {
        this.name = name;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.name);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getName());

        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
