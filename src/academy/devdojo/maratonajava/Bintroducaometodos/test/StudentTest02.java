package academy.devdojo.maratonajava.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Bintroducaometodos.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Karl Marx";
        student1.age = 1010;
        student1.gender = 'M';


        student2.name = "Lenin";
        student2.age = 1010;
        student2.gender = 'M';

        student1.imprime();






    }
}
