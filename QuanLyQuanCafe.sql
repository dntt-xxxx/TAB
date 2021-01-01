CREATE DATABASE QuanLyQuanCaFe
GO
USE QuanLyQuanCaFe
GO
--food
--table
--food category
--account
--bill
--billInfo
CREATE TABLE Tablefood
(
	id INT IDENTITY PRIMARY KEY,
	name NVARCHAR(100) NOT NULL,
	state NVARCHAR(100) NOT NULL DEFAULT N'Trống'--trống||có người
)
GO
CREATE TABLE Acount
(
	id INT IDENTITY PRIMARY KEY,
	DisplayName NVARCHAR(100) NOT NULL,
	UserName NVARCHAR(100)NOT NULL,
	Password NVARCHAR(100)NOT NULL,
	Type INT NOT NULL
)
GO
CREATE TABLE Foodcategory
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
CREATE TABLE Bill
(
	id INT IDENTITY PRIMARY KEY,
	DatecheckIn DATE NOT NULL,
	DatecheckOut DATE,
	idTable INT NOT NULL,
	state INT NOT NULL--1 đã thanh toán||0 là chưa
)
GO
CREATE TABLE BillInFo
(	
	id INT IDENTITY PRIMARY KEY,
	idBill INT NOT NULL,
	idFood INT NOT NULL,
	count INT NOT NULL DEFAULT 0

	FOREIGN KEY (idBill) REFERENCES dbo.Bill(id),
	FOREIGN KEY (idFood) REFERENCES dbo.Food(id)
)
GO


