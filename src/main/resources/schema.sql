DROP TABLE IF EXISTS TBL_EMPLOYEES;
 
CREATE TABLE TBL_EMPLOYEES (
  student_id INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL,
  Passwd VARCHAR(250) NOT NULL,
  Phno VARCHAR(250) DEFAULT NULL
);