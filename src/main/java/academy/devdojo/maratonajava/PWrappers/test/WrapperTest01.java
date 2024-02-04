package academy.devdojo.maratonajava.PWrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatp = 10f;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;



        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10f;
        Double doubleW = 10D;
        Character charW = 'w';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1"); // Converte a string em int
        boolean verdadeiro = Boolean.parseBoolean("Verdadeiro");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toUpperCase('!'));
        System.out.println(Character.toLowerCase('!'));



    }
}
