package Day11;

class CException extends RuntimeException {

    public CException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {
        try {
            throw new RuntimeException("Runtime exception");
        } catch (RuntimeException e) {
            throw new CException(e.getMessage());
        }
    }
}
