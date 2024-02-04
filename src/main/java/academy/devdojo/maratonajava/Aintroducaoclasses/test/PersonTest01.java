package academy.devdojo.maratonajava.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Student;

public class PersonTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Rodrigo";
        student1.age = 29;
        student1.gender = 'M';
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);

    }
}
