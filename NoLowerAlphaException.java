public class NoLowerAlphaException extends RuntimeException{

    public NoLowerAlphaException() {
        this("⦁\tPassword doesn’t contain a lowercase alpha character ");
    }


    public NoLowerAlphaException(String message) {
        super(message);
    }
}


