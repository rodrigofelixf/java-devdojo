package academy.devdojo.maratonajava.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Rodrigo"; //SString constant pool
        String nome2 = "Rodrigo";
        System.out.println(nome == nome2);
        nome = nome.concat(" Felix");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Rodrigo"); // cria outra string fora da piscina
        System.out.println(nome2== nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
