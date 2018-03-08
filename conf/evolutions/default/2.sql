# --- Sample dataset
 
# --- !Ups
 
delete from address;
delete from department;
delete from employee;
delete from project;
delete from project_employee;

insert into address (id,name) values ( 1,'Audio' );
insert into address (id,name) values ( 2,'Books' );
insert into address (id,name) values ( 3,'Computer' );
insert into address (id,name) values ( 4,'Furniture' );
insert into address (id,name) values ( 5,'Kitchen' );
insert into address (id,name) values ( 6,'Laundry' );
insert into address (id,name) values ( 7,'Mobile Phone' ); 
insert into address (id,name) values ( 8,'Television' ); 

insert into department (id,name) values ( 1,'Audio' );
insert into department (id,name) values ( 2,'Books' );
insert into department (id,name) values ( 3,'Computer' );
insert into department (id,name) values ( 4,'Furniture' );
insert into department (id,name) values ( 5,'Kitchen' );
insert into department (id,name) values ( 6,'Laundry' );
insert into department (id,name) values ( 7,'Mobile Phone' ); 
insert into department (id,name) values ( 8,'Television' ); 
 
insert into employee (id,name,description,stock,price) values ( 1,'June Austin','Steel Electric Kettle',100,55.00 );
insert into employee (id,name,description,stock,price) values ( 2,'Margarita Jackson','Fridge + freezer large',45,799.00 );
insert into employee (id,name,description,stock,price) values ( 3,'Lorene Robinson','250GB music player (MP3,MP4,WMA,WAV)',5,99.00 );
insert into employee (id,name,description,stock,price) values ( 4,'Marie Townsend','HP laptop,8GB RAM,250GB SSD',45,799.00 );
insert into employee (id,name,description,stock,price) values ( 5,'Salvatore Hammond','Android 5.1 Tablet,32GB storage,8inch screen',5,99.00 );
insert into employee (id,name,description,stock,price) values ( 6,'Joyce Evans','Sony 4K,OLED,Smart TV',12,2799.00 );
insert into employee (id,name,description,stock,price) values ( 7,'Christina James','1600rpm spin,A+++ rated,10KG',50,699.00 );
insert into employee (id,name,description,stock,price) values ( 8,'Lois Glove','Windows 10,5.2inch OLED,3GB RAM,64GB Storage',45,799.00 );
insert into employee (id,name,description,stock,price) values ( 9,'Mindy Quinn','Windows 10,128GB storage,8inch screen',5,299.00 );
insert into employee (id,name,description,stock,price) values ( 10,'Jody Taylor','Oven + Grill,Stainless Steel',10,399.00 );
insert into employee (id,name,description,stock,price) values ( 11,'Lee Love','Super King size,super comfort mattress',5,899.00 );
insert into employee (id,name,description,stock,price) values ( 12,'Nora Wright','Become a JavaScript expert in 2 hours!',50,29.00 );
 
insert into project (id,name,description,stock,price) values ( 1,'June Austin','Steel Electric Kettle',100,55.00 );
insert into project (id,name,description,stock,price) values ( 2,'Margarita Jackson','Fridge + freezer large',45,799.00 );
insert into project (id,name,description,stock,price) values ( 3,'Lorene Robinson','250GB music player (MP3,MP4,WMA,WAV)',5,99.00 );
insert into project (id,name,description,stock,price) values ( 4,'Marie Townsend','HP laptop,8GB RAM,250GB SSD',45,799.00 );
insert into project (id,name,description,stock,price) values ( 5,'Salvatore Hammond','Android 5.1 Tablet,32GB storage,8inch screen',5,99.00 );
insert into project (id,name,description,stock,price) values ( 6,'Joyce Evans','Sony 4K,OLED,Smart TV',12,2799.00 );
insert into project (id,name,description,stock,price) values ( 7,'Christina James','1600rpm spin,A+++ rated,10KG',50,699.00 );
insert into project (id,name,description,stock,price) values ( 8,'Lois Glove','Windows 10,5.2inch OLED,3GB RAM,64GB Storage',45,799.00 );
insert into project (id,name,description,stock,price) values ( 9,'Mindy Quinn','Windows 10,128GB storage,8inch screen',5,299.00 );
insert into project (id,name,description,stock,price) values ( 10,'Jody Taylor','Oven + Grill,Stainless Steel',10,399.00 );
insert into project (id,name,description,stock,price) values ( 11,'Lee Love','Super King size,super comfort mattress',5,899.00 );
insert into project (id,name,description,stock,price) values ( 12,'Nora Wright','Become a JavaScript expert in 2 hours!',50,29.00 );
 
insert into project_employee (category_id,product_id) values (5,1);
insert into project_employee (category_id,product_id) values (5,2);
insert into project_employee (category_id,product_id) values (1,3);
insert into project_employee (category_id,product_id) values (3,4);
insert into project_employee (category_id,product_id) values (3,5);
insert into project_employee (category_id,product_id) values (8,6);
insert into project_employee (category_id,product_id) values (6,7);
insert into project_employee (category_id,product_id) values (7,8);  
insert into project_employee (category_id,product_id) values (3,9);
insert into project_employee (category_id,product_id) values (5,10);
insert into project_employee (category_id,product_id) values (4,11);
insert into project_employee (category_id,product_id) values (2,12);
insert into project_employee (category_id,product_id) values (5,7);
insert into project_employee (category_id,product_id) values (3,8);
insert into project_employee (category_id,product_id) values (3,3);  
