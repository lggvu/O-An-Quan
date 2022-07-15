package sourcecode.exception;

public class EmptyCellException extends Exception {
    public EmptyCellException() {
    }

    public EmptyCellException(String message) {
        super(message);
    }

    public EmptyCellException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyCellException(Throwable cause) {
        super(cause);
    }

    public EmptyCellException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
