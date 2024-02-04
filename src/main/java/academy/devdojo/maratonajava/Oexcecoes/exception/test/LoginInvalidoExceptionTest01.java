package academy.devdojo.maratonajava.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.Oexcecoes.dominio.LoginIvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginIvalidoException e) {
            throw new RuntimeException(e);
        }

    }

    private static void logar() throws LoginIvalidoException {
        Scanner teclado = new Scanner(System.in);

        String userNameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();


        if (!userNameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginIvalidoException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
