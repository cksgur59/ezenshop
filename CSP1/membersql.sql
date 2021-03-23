drop table member

CREATE TABLE member(
id VARCHAR2(50) PRIMARY KEY,
pw VARCHAR2(100) NOT NULL,
name VARCHAR2(30) NOT NULL,
gender VARCHAR2(10) NOT NULL,
email  VARCHAR2(100) NOT NULL,
address1 VARCHAR2(300) NOT NULL,
address2 VARCHAR2(300) NOT NULL,
address3 VARCHAR2(300) NOT NULL,
phone VARCHAR2(100) NOT NULL,
admin NUMBER NOT NULL,
money NUMBER NOT NULL,
point NUMBER NOT NULL,
regDate DATE DEFAULT SYSDATE,
updateDate DATE DEFAULT SYSDATE
)

SELECT * FROM MEMBER

ALTER TABLE member ADD phoneNumber NUMBER NOT NULL

UPDATE member SET admin = 1 where id = 'lch559';

CREATE TABLE product(
product_id	VARCHAR2(50)	PRIMARY KEY,
product_No	NUMBER	NOT NULL,
product_Name	VARCHAR2(100)	NOT NULL,
product_group	VARCHAR2(50)	NOT NULL,
product_img	VARCHAR2(300)	NOT NULL,
product_price	NUMBER	NOT NULL,
product_point	NUMBER	NOT NULL,
product_stock	NUMBER	NOT NULL,
CONSTRAINT product_fk_id FOREIGN KEY(product_id) REFERENCES member(id)

)