
import java.io.Serializable;

public class LoginResponse extends Response implements Serializable {
    private final String userId, name, username, email, phone;

    public LoginResponse(String userId, String name, String username, String email, String phone) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
}
