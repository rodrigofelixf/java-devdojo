package academy.devdojo.maratonajava.ZZAclassesinternas.test;

public class OuterClassTest01 {
    private String nome = "Jonh Wick";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();
        Inner inner = outerClassTest01.new Inner();

        inner.printOuterClassAttribute();
    }
}
