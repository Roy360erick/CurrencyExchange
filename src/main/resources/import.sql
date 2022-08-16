insert into COINS (id,name,enabled,creation_Date) values (1,'Dolar',1,NOW());
insert into COINS (id,name,enabled,creation_Date) values (2,'SOL',1,NOW());
insert into COINS (id,name,enabled,creation_Date) values (3,'PESO ARGENTINO',1,NOW());


insert into exchange_rate (id,FK_Currency,sale_Price_In_Dolar,purchase_Price_In_Dolar,creation_Date,active,enabled) values (1,1,1,1,NOW(),1,1);
insert into exchange_rate (id,FK_Currency,sale_Price_In_Dolar,purchase_Price_In_Dolar,creation_Date,active,enabled) values (2,2,3.80,3.60,NOW(),1,1);
insert into exchange_rate (id,FK_Currency,sale_Price_In_Dolar,purchase_Price_In_Dolar,creation_Date,active,enabled) values (3,3,0.0091,0.0074,NOW(),1,1);



