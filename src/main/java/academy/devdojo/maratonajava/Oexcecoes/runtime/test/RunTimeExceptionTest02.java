package academy.devdojo.maratonajava.Oexcecoes.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(0, 1);

    }
    private static int divisao(int a, int b) {
      if (b == 0 || a == 0) {
          throw new IllegalArgumentException("Nao pode usar 0");
      }
      return a / b;
    }
}
