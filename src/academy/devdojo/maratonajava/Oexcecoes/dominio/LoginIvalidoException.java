package academy.devdojo.maratonajava.Oexcecoes.dominio;

public class LoginIvalidoException extends Exception{

    public LoginIvalidoException() {
        super("Login Invalido");
    }

    public LoginIvalidoException(String message) {
        super(message);
    }
}
