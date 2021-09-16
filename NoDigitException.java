public class NoDigitException extends RuntimeException{

    public NoDigitException() {
        this("The password must contain at least one digit\n");
    }


    public NoDigitException(String message) {
        super(message);
    }
}