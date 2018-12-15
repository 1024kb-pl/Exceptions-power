package pl.maniaq.unchecked;

public class TooShortPasswordException extends RuntimeException {
    public TooShortPasswordException() {
    }

    public TooShortPasswordException(String message) {
        super(message);
    }
}
