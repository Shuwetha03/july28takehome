create database ecommerce;
use ecommerce;

create table product(id bigint primary key,sku varchar(255),
name varchar(255),
description varchar(255),
unitprice decimal(13,2),
url varchar(255),
active bit(1),
unitsinstock int,
datecreated datetime(6),
lastupdated datetime(6),
categoryid bigint,foreign key(categoryid) references productcategory(categoryid));

create table productcategory(categoryid bigint primary key, categoeryname varchar(255));

insert into productcategory values(1,"Phones"),(2,"Fashion"),(3,"Beauty"),(4,"Electronic");

insert into product values(101,"K89CH","Iphone","13 pro max",125687.90,"https://m.media-amazon.com/images/I/61i8Vjb17SL._SL1500_.jpg",1,12,'2021-09-08 17:51:04.78','2022-09-08 17:51:04.78',1);
insert into product values(102,"OL32P","Jeans","Levis size 32",1287.45,"https://www.levi.in/on/demandware.static/-/Sites-LeviIN-Library/en_IN/dw9875f31e/images/homepage/CategoryTiles/CategoryTilesHomePage/Category%202%20-%20Women_s%20Jeans.jpg",1,34,'2020-05-18 17:51:04.78','2022-12-21 17:51:04.78',2);
insert into product values(103,"HI90M","Sunscream","spf proof",457.80,"https://img.freepik.com/premium-vector/product-mock-up-design-sunscreen-cream-spf-50_48190-462.jpg?w=2000",0,12,'2018-10-21 17:51:04.78','2022-07-27 17:51:04.78',3);
insert into product values(104,"AS67K","TV","Samsung 75 inch",215787.60,"https://i.gadgets360cdn.com/products/televisions/large/1548155083_832_samsung_75-inch-led-ultra-hd-4k-tv-75nu8000.jpg",1,4,'2020-09-08 17:51:04.78','2022-06-08 17:51:04.78',4);
insert into product values(106,"IHJ789","Shirts","Women",567.80,"https://assets.myntassets.com/dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/14881452/2022/1/28/b2e626b1-817b-4782-9032-f14e951af79a1643352353695-UTH-by-Roadster-Girls-White-Cotton-Self-Design-Semi-Sheer-Ca-1.jpg",1,13,'2018-10-21 17:51:04.78','2022-07-27 17:51:04.78',2);

select * from product;
select * from productcategory;

drop table product;

delete from productcategory where categoryname = "Grocery";

alter table productcategory rename column categoeryname to categoryname;

UPDATE product
SET url = "https://images.samsung.com/uk/smartphones/galaxy-s21/buy/02_ImageCarousel/04_GroupShot-O1/S21_Group_KV_MO_img.jpg"
WHERE id = 105;