package academy.devdojo.maratonajava.Gassociacao.dominio;

public class Aluno {
    private String name;
    private double age;

    private Seminario seminario;

    public Aluno(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Aluno(String name, double age, Seminario seminario) {
        this.name = name;
        this.age = age;
        this.seminario = seminario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
