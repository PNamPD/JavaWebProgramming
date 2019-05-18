drop database if exists QLYTHUVIEN; -- kiem tra xem da co database ten do chua
create database  QLYTHUVIEN ; -- tao database
use QLYTHUVIEN; -- huong vao doi tuong thu vien
drop table if exists SACH;
create table QLYTHUVIEN.SACH(
masach int not null,
ten varchar(30) not null,
tacgia varchar(30) not null,
nxb varchar(30) ,
soluong int ,
primary key (masach) 
);

create table QLYTHUVIEN.DOCGIA(
sothe int not null,
ten varchar(15) not null,
khoa varchar(20) not null,
khoahoc varchar(25) ,
thoihanthe date,
primary key (sothe)
); 
create table QLYTHUVIEN.PHIEUMUON(
masach int not null,
sothe int not null,
ngaymuon date,
ngaytra date,
ghichu varchar(30) ,
constraint primary key (masach,sothe) -- primary key (masach,sothe)
-- add foreign key
-- foreign key(masach)
-- references SACH(masach)

);
alter table PHIEUMUON
add foreign key (sothe) references DOCGIA(sothe)
;
insert into QLYTHUVIEN.SACH(masach,ten,tacgia,soluong)
VALUES
('1','harry porter','marry','102'),
('2','con duong to lua','han mac tu','15'),
('3','truyen doi toi','nam','1'),
('4','bep lua','bang kieu','150'),
('5','nhung nguoi khon kho','VictorHuygo','68');


insert into QLYTHUVIEN.DOCGIA(sothe,ten,khoa,khoahoc,thoihanthe)
value
('1','nam','2019','ATTT','2010-10-2'),
('2','hieu','2018','CNTT','2010-7-10'),
('3','toan','2017','ATTT','2010-6-20'),
('4','tuan','1999','ATTT','2010-8-21'),
('5','nam','2019','ATTT','2010-1-15');

insert into QLYTHUVIEN.PHIEUMUON(masach,sothe,ngaymuon,ngaytra,ghichu)
value
('1','1','2010-1-10','2010-9-2','bi rach'),
('2','2','2010-2-9','2010-8-2','k sao'),
('3','3','2010-3-8','2010-7-2','bi rach'),
('4','4','2010-4-7','2010-6-2','hong sao'),
('5','5','2010-5-6','2010-5-1','bi rach');
-- select *from qlythuvien.sach;
-- select *from qlythuvien.docgia;
-- select *from qlythuvien.phieumuon;
-- xoa dong trong bang 
-- delete from qlythuvien.sach where tacgia;
-- update dong trong bang
-- update qlythuvien.sach set nxb = 'bang viet' where masach = 4;
-- hien thi ten,khoa cua cac doc gia va sap xep theo khoa
select  ten where qlythuvien.docgia ;
select  khoa where qlythuvien.docgia ;



