create table item (
    item_id number(5,0) not null,
    item_name varchar2(20),
    price number(5,0) not null,
    constraint "item_pk" primary key(item_id)
);
drop sequence item_seq;
create sequence "ITEM_SEQ" 
start with 1
increment by 1 
maxvalue 99999
nocache
nocycle
noorder;

insert into item values (item_seq.nextval, '노트북', 50000);
insert into item values (item_seq.nextval, '모니터', 30000);
insert into item values (item_seq.nextval, '외장하드', 10000);

create table payment_info (
    payment_info_id number(5,0) not null,
    price number(5,0) not null,
    constraint "payment_info_pk" primary key (payment_info_id)
);

create sequence "PAYMENT_SEQ" 
start with 1 
increment by 1
maxvalue 99999
nocache
nocycle
noorder;

create table purchase_order (
    purchase_order_id number(5,0) not null,
    item_id number(5,0) not null,
    payment_info_id number(5,0) not null,
    address varchar2(20) not null,
    constraint "purchase_order_pk" primary key (purchase_order_id)
);

create sequence "PURCHASE_SEQ" 
start with 1
increment by 1
maxvalue 99999
nocache
nocycle
noorder;


select * from payment_info;
select * from purchase_order;
drop table item
purge RECYCLEBIN;
select * from item;
delete from item;
select * from tab;

-- 트랜잭션 정상 처리 테스트
--insert into purchase_order value(4,1,100,"서울 중구");








