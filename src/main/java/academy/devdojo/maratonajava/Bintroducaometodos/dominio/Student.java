package academy.devdojo.maratonajava.Bintroducaometodos.dominio;

public class Student {
    public String name;
    public int age;
    public char gender;


    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
