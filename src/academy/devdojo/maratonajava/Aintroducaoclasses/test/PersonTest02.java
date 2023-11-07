package academy.devdojo.maratonajava.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Student;

public class PersonTest02 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Rodrigo";
        student.age = 29;
        student.gender = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

    }
}
