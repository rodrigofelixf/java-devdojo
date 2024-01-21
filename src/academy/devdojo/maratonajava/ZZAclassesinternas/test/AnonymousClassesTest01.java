package academy.devdojo.maratonajava.ZZAclassesinternas.test;


class Animal {
    void walking() {
        System.out.println("Animal Walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            public void walking() {
                System.out.println("Animal Walking in the shadow");
            }
        };

        animal.walking();

    }
}
