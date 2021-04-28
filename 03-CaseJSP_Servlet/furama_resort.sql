create database furama_resort;
use furama_resort;

create table `position`(
 position_id int not null,
 position_name varchar(45),
 constraint pk_position primary key(position_id)
 );
 
 create table education_degree(
 education_degree_id int not null,
 education_degree_name varchar(45),
	constraint pk_education_degree primary key(education_degree_id)
 );
 
 create table division(
 division_id int not null,
 division_name varchar(45),
 constraint pk_division primary key(division_id)
 );
 
 create table employee(
 employee_id int not null,
 employee_name varchar(45),
 employee_birthday date,
 employee_id_card varchar(45),
 employee_salary double,
 employee_phone varchar(45),
 employee_email varchar(45),
 employee_address varchar(45),
 position_id int,
 education_degree_id int,
 division_id int,
 username varchar(255),
 constraint pk_employee primary key(employee_id)
 );
 
 ALTER TABLE employee ADD CONSTRAINT fk_employee_position FOREIGN KEY (position_id) REFERENCES `position`(position_id);
 ALTER TABLE employee ADD CONSTRAINT fk_employee_education_degree FOREIGN KEY (education_degree_id) REFERENCES education_degree(education_degree_id);
 ALTER TABLE employee ADD CONSTRAINT fk_employee_division FOREIGN KEY (division_id) REFERENCES `division`(division_id);
 
 ALTER TABLE employee ADD CONSTRAINT fk_employee_user FOREIGN KEY (username) REFERENCES `user`(username);
 
 create table `role`(
  role_id int not null,
  role_name varchar(255),
  constraint pk_role primary key (role_id)
  );

 create table `user`(
	username varchar(255),
	password varchar(255),
	constraint pk_user primary key (username)
 );
 
 create table user_role(
	role_id int not null,
    username varchar(255)
);

ALTER TABLE user_role ADD CONSTRAINT fk_user_role_user FOREIGN KEY (username) REFERENCES `user`(username);
  
ALTER TABLE user_role ADD CONSTRAINT fk_user_role_role FOREIGN KEY (role_id) REFERENCES `role`(role_id);

create table customer(
	customer_id int not null,
    customer_type_id int,
    customer_name varchar(45),
    customer_birthday date,
    customer_gender bit(1),
    customer_id_card varchar(45),
    customer_phone varchar(45),
    customer_email varchar(45),
    customer_address varchar(45),
    constraint pk_customer primary key(customer_id)
    );

ALTER TABLE customer ADD CONSTRAINT fk_customer_customer_type FOREIGN KEY (customer_type_id) REFERENCES customer_type(customer_type_id);

create table customer_type(
	customer_type_id int not null,
    customer_type_name varchar(45),
    constraint pk_customer_type primary key(customer_type_id)
    );
    
create table service_type(
	service_type_id int not null,
    service_type_name varchar(45),
    constraint pk_service_type primary key(service_type_id)
    );
    
create table service(
	service_id int not null,
    service_name varchar(45),
    service_area int,
    service_cost double,
    service_max_people int,
    rent_type_id int,
    service_type_id int,
    standard_room varchar(45),
    description_other_convenience varchar(45),
    pool_area double,
    number_of_floors int,
    constraint pk_serive primary key(service_id)
    );
    
create table rent_type(
	rent_type_id int not null,
    rent_type_name varchar(45),
    rent_type_cost double,
    constraint pk_servive primary key(rent_type_id)
);

ALTER TABLE service ADD CONSTRAINT fk_service_serice_type FOREIGN KEY (service_type_id) REFERENCES service_type(service_type_id);

ALTER TABLE service ADD CONSTRAINT fk_service_rent_type FOREIGN KEY (rent_type_id) REFERENCES rent_type(rent_type_id);

create table contract_detail(
	contract_detail_id int not null,
    contract_id int,
    attach_service_id int,
    quantity int,
    constraint pk_contract_detail primary key (contract_detail_id)
    );
    
create table attach_service(
	attach_service_id int,
    attach_service_name varchar(45),
    attach_service_cost double,
    attach_service_unit int,
    attach_service_status varchar(45),
    constraint pk_attach_service primary key(attach_service_id)
);

ALTER TABLE contract_detail ADD CONSTRAINT fk_contract_detail_attach_service FOREIGN KEY (attach_service_id) REFERENCES attach_service(attach_service_id);

ALTER TABLE contract_detail ADD CONSTRAINT fk_contract_detail_contract FOREIGN KEY (contract_id) REFERENCES contract(contract_id);

create table contract(
	contract_id int not null,
    contract_start_date datetime,
    contract_end_date datetime,
    contract_deposit double,
    contract_total_money double,
    employee_id int,
    customer_id int,
    service_id int,
    constraint pk_contract primary key(contract_id)
    );

ALTER TABLE contract ADD CONSTRAINT fk_contract_employee FOREIGN KEY (employee_id) REFERENCES employee(employee_id);

ALTER TABLE contract ADD CONSTRAINT fk_contract_customer FOREIGN KEY (customer_id) REFERENCES customer(customer_id);

ALTER TABLE contract ADD CONSTRAINT fk_contract_service FOREIGN KEY (service_id) REFERENCES service(service_id);


 
 
 
 

