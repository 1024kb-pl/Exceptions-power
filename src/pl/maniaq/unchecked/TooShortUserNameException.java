package pl.maniaq.unchecked;

public class TooShortUserNameException extends RuntimeException {
    public TooShortUserNameException(String message) {
        super(message);
    }
}
