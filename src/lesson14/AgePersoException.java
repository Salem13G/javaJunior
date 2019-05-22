package lesson14;

public class AgePersoException extends RuntimeException {
    public AgePersoException() {
    }

    public AgePersoException(String message) {
        super(message);
    }

    public AgePersoException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgePersoException(Throwable cause) {
        super(cause);
    }

    public AgePersoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
