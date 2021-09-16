public class InvalidSequenceException extends RuntimeException{

    public InvalidSequenceException() {
        this("⦁\tPassword contains more than 2 of the same character in sequence ");
    }


    public InvalidSequenceException(String message) {
        super(message);
    }
}







