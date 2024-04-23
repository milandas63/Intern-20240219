# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
# # # #                                SOFTWARE ON                                # # # #
# # # #                    EMPLOYEE QR-CODE ATTENDANCE SYSTEM                     # # # #
# # # #                                                                           # # # #
# # # #                      SYSTEM REQUIREMENT SPECIFICATION                     # # # #
# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #

DROP DATABASE IF EXISTS qr_attendance;
CREATE DATABASE IF NOT EXISTS qr_attendance;
USE qr_attendance;

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
    (1, "Milan Das"),
    (2, "Akash Kumar Samal"),
    (3, "Jyoti Prakash Das"),
    (4, "Sunita Nayak");


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
    ( 1, 1, 1),     # 1-Milan-View
    ( 2, 1, 2),     # 2-Milan-Add
    ( 3, 2, 1),     # 1-Akash-View
    ( 4, 2, 2),     # 2-Akash-Add
    ( 5, 2, 3),     # 3-Akash-Edit
    ( 6, 2, 4),     # 4-Akash-Delete
    ( 7, 2, 5);     # 5-Akash-Report


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
    user_id         INT(6)              NOT NULL REFERENCES user(user_id),
    dlu             TIMESTAMP,
    del             ENUM("*")           DEFAULT NULL,
    PRIMARY KEY(con_id)
);
INSERT INTO control(con_id,org_name,org_abbr,org_address,org_regd_no,db_name) VALUES
    (1, 'IIG Varsity','IV','E/43, iHub, Infocity Avenue, Chandrasekharpur, Bhubaneswar 751024', 'ORPH346/1999', 'qr_attandance');

##################
###  Employee  ###
##################
