# --- !Ups


# --- !Ups
delete from user;

insert into user (email,name,password,role) values ( 'admin@easyltd.com', 'Kathleen Admin', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'manager@easyltd.com', 'Carol Manager', 'password', 'manager' );

insert into user (email,name,password,role) values ( 'customer@easyltd.com', 'Frank Customer', 'password', 'customer' );