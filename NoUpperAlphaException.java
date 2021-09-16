public class NoUpperAlphaException extends RuntimeException{

    public NoUpperAlphaException() {
        this("⦁\tPassword doesn’t contain an uppercase alpha character ");
    }


    public NoUpperAlphaException(String message) {
        super(message);
    }
}






