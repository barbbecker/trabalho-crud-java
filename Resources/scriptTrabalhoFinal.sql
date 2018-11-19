show databases;
create database Fundatec;
use Fundatec;

CREATE TABLE itens (
 id int NOT NULL AUTO_INCREMENT,
 nome varchar(128) NOT NULL,
 preco double NOT NULL,
 PRIMARY KEY (id)
);


SET@@global.time_zone='-03:00';

select * from itens;
