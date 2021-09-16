public class LengthException extends RuntimeException{

        public LengthException() {
            this("The password must be at least 6 characters long");
        }


        public LengthException(String message) {
            super(message);
        }
    }

