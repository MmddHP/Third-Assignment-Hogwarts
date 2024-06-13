import java.util.Objects;
import java.util.UUID;

public class Account {
    private String username;
    private String password;
    private UUID accountID;

    public boolean validatePassword(String enteredPassword) {
        return Objects.equals(password, enteredPassword);
    }

    public void changeUsername(String newUsername) {
        username=newUsername;
    }

    public void changePassword(String newPassword) {
        password=newPassword;
    }

}

