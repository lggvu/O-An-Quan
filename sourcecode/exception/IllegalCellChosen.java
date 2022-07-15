package sourcecode.exception;

public class IllegalCellChosen extends Exception {
    public IllegalCellChosen() {
    }

    public IllegalCellChosen(String message) {
        super(message);
    }

    public IllegalCellChosen(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalCellChosen(Throwable cause) {
        super(cause);
    }

    public IllegalCellChosen(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
