--Select 
--ANSII
Select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers

Select * from Customers where City = 'Berlin'


--case insensitive

Select * from Products where CategoryID = 1 or CategoryID = 3

Select * from Products where CategoryID = 1 and UnitPrice >= 10


Select * from Products order by CategoryID,ProductName

Select * from Products order by UnitPrice  asc --ascending (artan) default sıralama

Select * from Products order by UnitPrice  desc --descending (azalan) 

Select * from Products where categoryID = 1 order by UnitPrice  desc --descending (azalan) 

Select count(*) from Products

Select count(*) Adet from Products

Select * from Products  

Select CategoryID, count(*) from Products group by CategoryID

Select CategoryID, count(*) from Products group by CategoryID having count(*)<10

Select CategoryID, count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10

Select *
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID


Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID


--C# dilinde, DTO Data Transformation Object

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

-- Inner Join: Sadece iki tabloda da eşleşenleri bir araya getirir.
-- Eşleşmeyen veriyi getirmez.

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID

-- Left Join: Solda (Products) olup sağda ([Order Details]) olmayanları da getirir

Select * from Products p left join [Order Details] od 
on p.ProductID = od.ProductID

Select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null 


Select * from Customers c right join Orders o 
on c.CustomerID = o.CustomerID

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o 
on o.OrderID = od.OrderID 