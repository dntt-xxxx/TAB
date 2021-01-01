CREATE DATABASE QuanLyQuanCaFe
GO
USE QuanLyQuanCaFe
GO
--food
--table
--danh sách đồ ăn
--tài khoản
--hóa đơn
--thông tin hóa đơn
CREATE TABLE Ban
(
	id INT IDENTITY PRIMARY KEY,
	name NVARCHAR(100) NOT NULL,
	state NVARCHAR(100) NOT NULL DEFAULT N'Trống'--trống||có người
)
GO
CREATE TABLE tk
(
	id INT IDENTITY PRIMARY KEY,
	UserName NVARCHAR(100)NOT NULL,
	Password NVARCHAR(100)NOT NULL,
	
GO
CREATE TABLE DANHMUCDOAN
(
	id INT IDENTITY PRIMARY KEY,
	name NVARCHAR(100) NOT NULL
)
GO
CREATE TABLE Food
(
	id INT IDENTITY PRIMARY KEY,
	name NVARCHAR(100) NOT NULL,
	idCategory INT NOT NULL,
	price FLOAT NOT NULL
)
GO
CREATE TABLE HOADON
(
	id INT IDENTITY PRIMARY KEY,
	DatecheckIn DATE NOT NULL,
	DatecheckOut DATE,
	idTable INT NOT NULL,
	state INT NOT NULL--1 đã thanh toán||0 là chưa
)
GO
CREATE TABLE THONGTINHOADON
(	
	id INT IDENTITY PRIMARY KEY,
	idBill INT NOT NULL,
	idFood INT NOT NULL,
	count INT NOT NULL DEFAULT 0

	FOREIGN KEY (idBill) REFERENCES dbo.Bill(id),
	FOREIGN KEY (idFood) REFERENCES dbo.Food(id)
)
GO


