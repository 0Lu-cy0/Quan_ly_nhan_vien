CREATE DATABASE Quan_Ly_Nhan_Vien;
USE Quan_Ly_Nhan_Vien;

CREATE TABLE Employee (
    employee_id VARCHAR(64) PRIMARY KEY,
    fullname VARCHAR(50),
    date_of_birth DATE,
    job_title VARCHAR(50),
    address VARCHAR(100),
    password VARCHAR(50)
);

CREATE TABLE Salary (
    salary_id INT PRIMARY KEY,
    employee_id VARCHAR(64),
    base_salary FLOAT,
    bonus FLOAT,
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);

CREATE TABLE Attendance (
    attendance_id INT PRIMARY KEY,
    employee_id VARCHAR(64),
    attendance_date DATE,
    status VARCHAR(20),
    check_in TIME,
    check_out TIME,
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);

CREATE TABLE Benefits (
    benefit_id INT PRIMARY KEY,
    employee_id VARCHAR(64),
    benefit_type VARCHAR(50),
    description TEXT,
    amount FLOAT,
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);
