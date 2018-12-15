package pl.maniaq.unchecked;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserService {
    private List<String> users = new LinkedList<>(Arrays.asList("Pablo", "Domindo", "Godrto"));

    public void addUser(String user, String password) {
        validateUserExistence(user);

        validatePassword(password);

        validateUser(user);

        users.add(user);
    }


    private void validatePassword(String password) {
        if (password.length() < 6) {
            throw new TooShortPasswordException(String.format("Password: %s is too short.", password));
        }
    }

    private void validateUserExistence(String user) {
        if (users.contains(user)) {
            throw new UserLoginExistException(String.format("User: %s exists!", user));
        }
    }

    private void validateUser(String user) {
        if (user.length() < 3) {
            throw new TooShortUserNameException(String.format("User name: %s is too short", user));
        }
    }

}
