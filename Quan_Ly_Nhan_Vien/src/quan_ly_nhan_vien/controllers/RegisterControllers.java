package quan_ly_nhan_vien.controllers;

import java.util.ArrayList;
import java.util.List;
import quan_ly_nhan_vien.models.RegisterModels;
import quan_ly_nhan_vien.views.RegisterViews;
import quan_ly_nhan_vien.dao.RegisterDAO;
import quan_ly_nhan_vien.utils.HashPassword;

public class RegisterControllers {

    private final RegisterModels registerModel;
    private final RegisterViews registerViews;
    private final RegisterDAO registerDAO;

    public RegisterControllers(RegisterViews registerViews) {
        this.registerModel = new RegisterModels();
        this.registerViews = registerViews;
        this.registerDAO = new RegisterDAO();
    }

    public List<String> validateEmail(String email) {
        List<String> errors = new ArrayList<>();
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{3,6}$";
        if (!email.matches(emailRegex)) {
            errors.add("Email không đúng định dạng.");
        }
        return errors;
    }

    public List<String> validatePhoneNumber(String phoneNumber) {
        List<String> errors = new ArrayList<>();
        if (!phoneNumber.matches("\\d{10,11}")) {
            errors.add("Số điện thoại phải có 10-11 chữ số.");
        }
        return errors;
    }

    public List<String> validatePassword(String password) {
        List<String> errors = new ArrayList<>();
        if (!password.matches(".*\\d.*")) {
            errors.add("Mật khẩu cần ít nhất một chữ số.");
        }
        if (!password.matches(".*[a-z].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự chữ thường.");
        }
        if (!password.matches(".*[A-Z].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự chữ hoa.");
        }
        if (!password.matches(".*[@$!%*?&].*")) {
            errors.add("Mật khẩu cần ít nhất một ký tự đặc biệt.");
        }
        if (password.length() < 12) {
            errors.add("Mật khẩu cần ít nhất 12 ký tự.");
        }
        return errors;
    }

    public boolean registerUser(String username, String password, String fullname, String email, String phoneNumber) {

        if (registerDAO.isUsernameTaken(username)) {
            registerViews.showMessage("Tài khoản đã tồn tại.", "Lỗi");
            return false;
        } else if (registerDAO.isPhoneNumberTaken(phoneNumber)) {
            registerViews.showMessage("Số điện thoại đã tồn tại.", "Lỗi");
            return false;
        } else if (registerDAO.isEmailTaken(email)) {
            registerViews.showMessage("Email đã tồn tại.", "Lỗi");
            return false;
        }

        String hashedPassword = HashPassword.hashPassword(password);

        registerModel.setUsername(username);
        registerModel.setPassword(hashedPassword);
        registerModel.setFullname(fullname);
        registerModel.setEmail(email);
        registerModel.setPhoneNumber(phoneNumber);

        if (registerDAO.addUserToDatabase(registerModel)) {
            registerViews.showMessage("Tạo tài khoản thành công!", "Thành công");
            return true;
        } else {
            registerViews.showMessage("Không thể tạo tài khoản.", "Lỗi");
            return false;
        }
    }
}
