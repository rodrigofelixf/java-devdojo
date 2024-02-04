package academy.devdojo.maratonajava.Oexcecoes.runtime.test;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }

    }

}
