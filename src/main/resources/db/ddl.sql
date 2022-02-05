SET FOREIGN_KEY_CHECKS = 0;

--部署テーブル
DROP TABLE IF EXISTS departments;

CREATE TABLE departments (
		department_id INT(12) PRIMARY KEY,
		department_name VARCHAR(100) NOT NULL
);

--従業員テーブル
DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
    id INT(12) AUTO_INCREMENT PRIMARY KEY,
    department_id INT(12) NOT NULL,
    employee_number INT(12) ,
    last_name VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name_kana VARCHAR(100),
    first_name_kana VARCHAR(100),
    private_email VARCHAR(100),
    business_email VARCHAR(100),
    work_style VARCHAR(100),
    join_date DATE,
    remarks VARCHAR(100),
    created_at DATETIME NOT NULL,
    created_login_member_id INT(12),
    updated_at DATETIME,
    updated_login_member_id INT(12),
    retire_flg BIT NOT NULL,
    UNIQUE KEY employee_number (employee_number),
    UNIQUE KEY private_email (private_email),
    UNIQUE KEY email (email),
    FOREIGN KEY(department_id) REFERENCES departments(department_id)
);

--ログインメンバーテーブル
DROP TABLE IF EXISTS login_members;

CREATE TABLE login_members (
    id INT(12) AUTO_INCREMENT PRIMARY KEY,
    employee_id INT(12),
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME,
    resign_flg BIT NOT NULL
);

--権限テーブル
DROP TABLE IF EXISTS roles;

CREATE TABLE roles(
		role_id INT(12) PRIMARY KEY,
		role_name VARCHAR(100) NOT NULL
);

--ログインメンバー・権限の関連づけテーブル
DROP TABLE IF EXISTS login_members_roles;

CREATE TABLE login_members_roles(
    id INT(12) AUTO_INCREMENT PRIMARY KEY,
    login_member_id INT(12) NOT NULL,
    role_id INT(12) NOT NULL,
    FOREIGN KEY(login_user_id) REFERENCES login_users(login_user_id),
    FOREIGN KEY(role_id) REFERENCES roles(role_id)
);
