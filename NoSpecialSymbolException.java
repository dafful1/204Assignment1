public class NoSpecialSymbolException extends RuntimeException{
    public NoSpecialSymbolException() {
        this("⦁\tPassword doesn’t contain a special character ");
    }


    public NoSpecialSymbolException(String message) {
        super(message);
    }
}
