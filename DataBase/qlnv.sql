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
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(255),
    date_of_birth DATE,
    salary DECIMAL(10, 2)
);

CREATE TABLE Accounts (
    account_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role_id INT,
    FOREIGN KEY (employee_id) REFERENCES Employees(employee_id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES Roles(role_id) ON DELETE CASCADE
);

CREATE TABLE Attendances (
    attendance_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    day DATE,
    status VARCHAR(50),
    FOREIGN KEY (employee_id) REFERENCES Employees(employee_id) ON DELETE CASCADE
);

CREATE TABLE Salaries (
    salary_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    basic_salary DECIMAL(10, 2) NOT NULL,
    bonuses DECIMAL(10, 2) DEFAULT 0,
    deductions DECIMAL(10, 2) DEFAULT 0,
    net_salary DECIMAL(10, 2),
    salary_month INT NOT NULL,
    salary_year INT NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES Employees(employee_id) ON DELETE CASCADE
);

