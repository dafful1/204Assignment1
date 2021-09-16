public class UnmatchedException extends RuntimeException{

    public UnmatchedException() {
        this("The passwords do not match");
    }


    public UnmatchedException(String message) {
        super(message);
    }
}