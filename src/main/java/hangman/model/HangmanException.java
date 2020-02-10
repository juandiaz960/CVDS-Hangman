package hangman.model;

public class HangmanException extends Exception{
    
    public static final String PARAMETROS_INVALIDOS = "Los parametros no pueden ser negativos";

    public HangmanException(String mensaje) {
        super(mensaje);
    }
    
}