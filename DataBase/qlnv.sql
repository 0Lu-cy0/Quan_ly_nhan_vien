CREATE DATABASE Quan_Ly_Nhan_Vien;
USE Quan_Ly_Nhan_Vien;

CREATE TABLE Employee (
    employee_id INT PRIMARY KEY,
    fullname VARCHAR(50),
    date_of_birth DATE,
    job_title VARCHAR(50),
    address VARCHAR(20),
    password VARCHAR(50)  
);

CREATE TABLE Salary (
    salary_id INT PRIMARY KEY,
    employee_id INT,
    base_salary FLOAT,
    bonus  FLOAT,
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);

CREATE TABLE Attendance (
    attendance_id INT PRIMARY KEY,
    employee_id INT,
    attendance_date DATE,
    status VARCHAR(20),
    check_in TIME,
    check_out TIME,
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);

CREATE TABLE Benefits (
    benefit_id INT PRIMARY KEY,
    employee_id INT,
    benefit_type VARCHAR(50),
    description TEXT,
    amount FLOAT,
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);


INSERT INTO Employee (employee_id, fullname, date_of_birth, job_title, address, password) VALUES
(1, 'Nguyễn Văn A', '1990-01-01', 'Nhân viên', 'Hà Nội', 'Kinh doanh'),
(2, 'Trần Thị B', '1985-05-15', 'Quản lý', 'Đà Nẵng', 'Marketing'),
(3, 'Lê Văn C', '1992-03-20', 'Kỹ sư', 'TP.HCM', 'Kỹ thuật');

INSERT INTO Salary (salary_id, employee_id, base_salary, bonus) VALUES
(1, 1, 5000000, 1000000),
(2, 2, 7000000, 1500000),
(3, 3, 6000000, 1200000);

INSERT INTO Attendance (attendance_id, employee_id, attendance_date, status, check_in, check_out) VALUES
(1, 1, '2024-09-29', 'Present', '08:00:00', '17:00:00'),
(2, 2, '2024-09-29', 'Absent', NULL, NULL),
(3, 3, '2024-09-29', 'Late', '08:15:00', '17:00:00');

INSERT INTO Benefits (benefit_id, employee_id, benefit_type, description, amount) VALUES
(1, 1, 'Bảo hiểm y tế', 'Bảo hiểm sức khỏe cho nhân viên', 500000),
(2, 2, 'Thưởng lễ', 'Thưởng vào dịp lễ', 1000000),
(3, 3, 'Phụ cấp công tác', 'Phụ cấp cho công việc di chuyển', 300000);
