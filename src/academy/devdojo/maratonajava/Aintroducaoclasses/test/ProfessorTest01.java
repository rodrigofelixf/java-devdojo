package academy.devdojo.maratonajava.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.gender = 'M';

        System.out.println(professor.name + " " + professor.age + " " + professor.gender);
    }
}
