package pl.maniaq.unchecked;

public class UserExistException extends RuntimeException {
    public UserExistException() {
    }

    public UserExistException(String message) {
        super(message);
    }
}
