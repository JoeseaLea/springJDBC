DROP DATABASE IF EXISTS study;

CREATE DATABASE study DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

DROP TABLE IF EXISTS study.`T_USER`;

CREATE TABLE study.`T_USER` (
	id INT(10) PRIMARY KEY AUTO_INCREMENT,
	name_cn VARCHAR(20),
	login_name VARCHAR(20),
	PASSWORD VARCHAR(20)
);

SELECT * FROM study.`T_USER`;