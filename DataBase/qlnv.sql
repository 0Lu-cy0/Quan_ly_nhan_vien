USE quan_ly_nhan_vien;

CREATE TABLE Roles (
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(50) NOT NULL
);

-- Thêm dữ liệu mẫu vào bảng Roles
INSERT INTO Roles (role_name) VALUES ('Admin'), ('Employee');

CREATE TABLE Employees (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15),
    address VARCHAR(255),
    date_of_birth DATE,
    date_of_joining DATE NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
);

-- Thêm dữ liệu mẫu vào bảng Employees
INSERT INTO Employees (full_name, email, phone_number, address, date_of_birth, date_of_joining, salary) 
VALUES 
('John Doe', 'john.doe@example.com', '1234567890', '123 Main St', '1990-01-01', '2020-01-01', 50000),
('Jane Smith', 'jane.smith@example.com', '0987654321', '456 Elm St', '1985-02-15', '2018-03-15', 45000);


CREATE TABLE Accounts (
    account_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role_id INT,
    FOREIGN KEY (employee_id) REFERENCES Employees(employee_id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES Roles(role_id) ON DELETE CASCADE
);

-- Thêm dữ liệu mẫu vào bảng Accounts
-- Lưu ý: Các mật khẩu đã được băm SHA-256
INSERT INTO Accounts (employee_id, username, password, role_id) 
VALUES 
(1, 'admin_user', 'băm_mật_khẩu_admin', 1),
(2, 'employee_user', 'băm_mật_khẩu_employee', 2);

CREATE TABLE Timesheets (
    timesheet_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    work_date DATE NOT NULL,
    check_in TIME,
    check_out TIME,
    status VARCHAR(50) DEFAULT 'Present',
    FOREIGN KEY (employee_id) REFERENCES Employees(employee_id) ON DELETE CASCADE
);

-- Thêm dữ liệu mẫu vào bảng Timesheets
INSERT INTO Timesheets (employee_id, work_date, check_in, check_out, status) 
VALUES 
(2, '2024-10-10', '08:00:00', '17:00:00', 'Present'),
(2, '2024-10-11', '08:30:00', '17:30:00', 'Present');

CREATE TABLE Salaries (
    salary_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    basic_salary DECIMAL(10, 2) NOT NULL,
    bonuses DECIMAL(10, 2) DEFAULT 0,
    deductions DECIMAL(10, 2) DEFAULT 0,
    net_salary DECIMAL(10, 2) AS (basic_salary + bonuses - deductions) STORED,
    salary_month DATE NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES Employees(employee_id) ON DELETE CASCADE
);

-- Thêm dữ liệu mẫu vào bảng Salaries
INSERT INTO Salaries (employee_id, basic_salary, bonuses, deductions, salary_month) 
VALUES 
(2, 45000, 2000, 500, '2024-10-01');

