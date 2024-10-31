package quan_ly_nhan_vien.models;

public class LoginModels {
    private String username;
    private String password;

    public LoginModels(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter cho username
    public String getUsername() {
        return username;
    }

    // Setter cho username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter cho password
    public String getPassword() {
        return password;
    }

    // Setter cho password
    public void setPassword(String password) {
        this.password = password;
    }
}
