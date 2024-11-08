package quan_ly_nhan_vien.models;

import quan_ly_nhan_vien.utils.HashPassword;

public class LoginModels {
    private String username;
    private String hashedPassword;

    // Constructor nhận mật khẩu và tự động mã hóa
    public LoginModels(String username, String password) {
        this.username = username;
        this.hashedPassword = HashPassword.hashPassword(password);
    }

    // Getter cho username
    public String getUsername() {
        return username;
    }

    // Getter cho mật khẩu đã mã hóa
    public String getHashedPassword() {
        return hashedPassword;
    }

    // Setter cho mật khẩu (cập nhật mật khẩu mới, tự động mã hóa)
    public void setHashedPassword(String password) {
        this.hashedPassword = HashPassword.hashPassword(password);
    }

    // Setter cho username (nếu cần thiết trong quá trình xử lý)
    public void setUsername(String username) {
        this.username = username;
    }
}
