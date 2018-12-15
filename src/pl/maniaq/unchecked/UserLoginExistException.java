package pl.maniaq.unchecked;

public class UserLoginExistException extends RuntimeException {
    public UserLoginExistException() {
    }

    public UserLoginExistException(String message) {
        super(message);
    }
}
