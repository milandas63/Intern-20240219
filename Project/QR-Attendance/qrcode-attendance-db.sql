# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
# # # #                                SOFTWARE ON                                # # # #
# # # #               EMPLOYEE & STUDENT QR-CODE ATTENDANCE SYSTEM                # # # #
# # # #                                                                           # # # #
# # # #                      SYSTEM REQUIREMENT SPECIFICATION                     # # # #
# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #

DROP DATABASE IF EXISTS qrattendance;
CREATE DATABASE IF NOT EXISTS qrattendance;
USE qrattendance;

################
###  Action  ###
################
SELECT 'Action';
DROP TABLE IF EXISTS action;
CREATE TABLE IF NOT EXISTS action(
    act_id          INT(6)              NOT NULL AUTO_INCREMENT,
    act_desc        VARCHAR(50)         NOT NULL UNIQUE,
    dlu             TIMESTAMP,
    del             ENUM("*")           DEFAULT NULL,
    PRIMARY KEY(act_id)
);
INSERT INTO action VALUES
    (1, 'View',     NULL, NULL),
    (2, 'Add',      NULL, NULL),
    (3, 'Edit',     NULL, NULL),
    (4, 'Delete',   NULL, NULL),
    (5, 'Report',   NULL, NULL);


##############
###  User  ###
##############
SELECT 'User';
DROP TABLE IF EXISTS user;
CREATE TABLE IF NOT EXISTS user(
    user_id         INT(6)          NOT NULL AUTO_INCREMENT,
    user_name       VARCHAR(30)     NOT NULL UNIQUE,
    PRIMARY KEY(user_id)
);
INSERT INTO user VALUES
    (1, "Akasha Kumar Samal"),
    (2, "Jyoti Prakash Das"),
    (3, "Milan Das"),
    (4, "Kishore Kumar");


###################
###  Privilege  ###
###################
SELECT 'Privilege';
DROP TABLE IF EXISTS privilege;
CREATE TABLE IF NOT EXISTS privilege(
    priv_id         INT(6)          NOT NULL AUTO_INCREMENT,
    user_id         INT(6)          NOT NULL REFERENCES user(user_id),
    act_id          INT(6)          NOT NULL REFERENCES action(act_id),
    PRIMARY KEY(priv_id)
);
INSERT INTO privilege VALUES
    ( 1, 1, 1),     # 1-Akash-View
    ( 2, 1, 2),     # 2-Akash-Add
    ( 3, 2, 1),     # 1-Jyoti-View
    ( 4, 2, 2),     # 2-Jyoti-Add
    ( 5, 2, 3),     # 3-Jyoti-Edit
    ( 6, 2, 4),     # 4-Jyoti-Delete
    ( 7, 2, 5);     # 5-Jyoti-Report
    ( 8, 3, 1),     # 1-Milan-View
    ( 9, 3, 2),     # 2-Milan-Add
    (10, 3, 3),     # 3-Milan-Edit


#################           This table is used to keep the company name, GST No.,
###  Control  ###           Drug License No., Address, etc.
#################
SELECT 'Control';
DROP TABLE IF EXISTS control;
CREATE TABLE IF NOT EXISTS control(
    con_id          INT(6)              NOT NULL AUTO_INCREMENT,
    org_name        VARCHAR(50)         NOT NULL UNIQUE,
    org_abbr        VARCHAR(10)         DEFAULT NULL UNIQUE,
    org_address     VARCHAR(150)        DEFAULT NULL,
    org_regd_no     VARCHAR(30)         DEFAULT NULL,
    db_name         VARCHAR(30)         NOT NULL UNIQUE,
    gst_no          VARCHAR(30),
    user_id         INT(6)              NOT NULL REFERENCES user(user_id),
    dlu             TIMESTAMP,
    del             ENUM("*")           DEFAULT NULL,
    PRIMARY KEY(con_id)
);
INSERT INTO control(con_id,org_name,org_abbr,org_address,org_regd_no,db_name,gst_no,user_id) VALUES
    (1, 'Gandhi Institute For Technolgy','GIFT','Gangapada, Bhubaneswar 751024', 'AICTE234/1999', 'qrattendance', NULL, 1);


holiday-list
	SLNO FESTIVALS DATE DAY
	1 NEWYEAR 01-01-2024 MONDAY
	2 REPUBLIC DAY 26-01-2024 FRIDAY
	3 HOLi 26-03-2024 TUESDAY
	4 UTKAL DIVAS 01-04-2024 MONDAY
	5 EID UL FITR 11-04-2024 THURSDAY
	6 LABOUR DAY 01-05-2024 WEDNESDAY
	7 RAJO SANKRANTI 15-06-2024 SATURDAY
	8 INDEPENDENCE DAY 15-08-2024 THURSDAY
	9 GANDHI JAYANTI 02-10-2024 WEDNESDAY
	10 DUSSHRA 12-10-2024 SATURDAY
	11 DIWALI 31-10-2024 THURSDAY
	12 CHRISTI MAS 25-12-2024 WEDNESDAY


campus
	Campus-1
	Campus-2

####################
###  Department  ###
####################
SELECT 'Department';
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department(
	dep_id			INT(6)				NOT NULL AUTO_INCREMENT,
	dep_name		VARCHAR(50)			NOT NULL UNIQUE,
	dep_abbr		VARCHAR(10)			DEFAULT NULL UNIQUE,
	user_id			INT(6)				NOT NULL REFERENCE user(user_id),
    dlu				TIMESTAMP,
    del				ENUM("*")           DEFAULT NULL,
    PRIMARY KEY(dep_id)
);
INSERT INTO department VALUES
	( 1, 'Master in Business Administration', 'MBA',   1, NULL, NULL),
	( 2, 'Master in Computer Application',    'MCA',   1, NULL, NULL),
	( 3, 'Bachelor in Technology',            'BTech', 1, NULL, NULL),
	( 4, 'Master in Technology',              'MTech', 1, NULL, NULL),
	( 5, 'Diploma',                           'DIP',   1, NULL, NULL),
	Office', 1, NULL, NULL),
	Teaching', 1, NULL, NULL),
	Attendant', 1, NULL, NULL),
	Security', 1, NULL, NULL),
	Examination Cell', 1, NULL, NULL),


#####################
###  Attend_Type  ###
#####################
SELECT 'Attend_Type';
DROP TABLE IF EXISTS attend_type;
CREATE TABLE IF NOT EXISTS attend_type(
	attend_type_id		INT(6)				NOT NULL AUTO_INCREMENT,
	attend_type_desc	VARCHAR(50)			NOT NULL UNIQUE,
	attend_type_abbr	VARCHAR(10)			DEFAULT NULL UNIQUE,
	user_id				INT(6)				NOT NULL REFERENCE user(user_id),
    dlu					TIMESTAMP,
    del					ENUM("*")           DEFAULT NULL,
    PRIMARY KEY(attend_type_id)
);
INSERT INTO attend_type VALUES
	( 1, 'Student',				NULL, 1, NULL, NULL),
	( 2, 'Office Staff',		NULL, 1, NULL, NULL),
	( 3, 'Teaching Staff',		NULL, 1, NULL, NULL),
	( 4, 'Sub Staff',			NULL, 1, NULL, NULL),
	( 5, 'Director',			NULL, 1, NULL, NULL);


####################
###  Attendance  ###
####################
SELECT 'Attendance';
DROP TABLE IF EXISTS attendance;
CREATE TABLE IF NOT EXISTS attendance(
	attend_id		INT(6)				NOT NULL AUTO_INCREMENT,
	qr_code			INT(6)				NOT NULL UNIQUE,
	date			TIMESTAMP,
	attend_type
	campus_id
	depart_id
	attend_id
	attend_tick
	user_id
    dlu             TIMESTAMP,
    del             ENUM("*")           DEFAULT NULL,
    PRIMARY KEY(con_id)
