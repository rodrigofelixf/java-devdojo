package academy.devdojo.maratonajava.ZZAclassesinternas.test;

public class OuterClassTest03 {
    private String name = "Rodrigo";

    static class Nested {
        private String lastName = "Felix";

        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
