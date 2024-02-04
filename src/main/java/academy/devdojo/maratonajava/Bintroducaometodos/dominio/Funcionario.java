package academy.devdojo.maratonajava.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarios;
    private double mediaSalario = 0;




    public void imprimirDados() {
        System.out.println("Nome: " + this.name);
        System.out.println("idade: " + this.age);
        for (double salario : salarios) {
            System.out.println("salario: " + salario);
        }
        mediaSalario2();
    }


    public void mediaSalario(double... salarios) {
        for (double salario : salarios) {
            mediaSalario += salario / salarios.length;
        }
        System.out.println("media do salaria: " +mediaSalario);
    }

    public void mediaSalario2() {
        for (double salario : this.salarios ) {
            mediaSalario += salario / this.salarios.length;
        }
        System.out.println("media do salaria: " +mediaSalario);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

}
