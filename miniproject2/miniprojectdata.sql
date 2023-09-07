use miniprojectonecommerce;
create table productdetail(productid int(10) not null auto_increment primary key,
						   productname varchar(255),
						   descriptions varchar(255),
                           quantity int(10),
                           price float(20)
                           );

insert into productdetailproductdetail (productname,descriptions,quantity,price) values('DellLaptop', '8GB RAM 500GB HD', 5 ,50000),
																			('RealMiPRO PHONE', '8GB RAM, 32GB HD', 10, 15000),
                                                                            ('HPlaptop','8GB RAM 1TB HD', 5,80000),
                                                                            ('Maggi','atta noodles', 15,10),
                                                                            ('SAMSUNG TV', '4K UHD', 10,50000),
                                                                            ('MI TV', '4K UHD', 5,30000),
                                                                            ('Ashirvad atta', 'whole wheat atta 10 kg',5, 500),
                                                                            ('Everyday Battery','small', 50,20),
                                                                            ('SAMSUNGJ5 Phone','4GB RAM 16GB HD', 3,15000),
                                                                            ('SAMSUNG A21','16GB RAM 120GB HD', 10,20000 );

                                                                       
create table registereduserdetail ( userid int(10) not null auto_increment primary key,
									firstname varchar(255),
                                    lastname varchar(255) ,
                                    username varchar(255) not null,
                                    passwords varchar(255) not null,
                                    city varchar(255),
                                    mailid varchar(255),
                                    mobilenumber varchar(255),
                                    roleid int(10),
                                    rolename varchar(255),
									foreign key (roleid) references roles(roleid)
                                    );

insert into  registereduserdetail (firstname, lastname, username,passwords,city,mailid,mobilenumber) values
								  ('Ashwini','Bais','ashwinibais','ashwini123','begnaluru','ashwini@gmail.com','9008674534'),
                                  ('Nidhyana','sengar','nidhu@s', 'nidhya123','bengaluru','nidhya@gmail.com','8099785645') ,
                                  ('Akshita', 'gautam', 'akshita@g','akshita123','bengaluru','akshita@gmail.com','9067894523'),
                                  ('Neeraj', 'parihar','pariharneeraj','neeraj@123','pune','neeraj@gmail.com','6745789045'),
                                  ('Abhijit', 'pawar','pawarabhijit','abhijit@123','katol','abhijit@gmail.com','5678904523');
                                  
use miniprojectonecommerce;
create table cartdetail ( cartid int(10) not null auto_increment primary key,
						  orderid int(10) ,
						  userid int(10) not null,
                          username varchar(255) not null,
                          productid int(10) not null,
                          productname varchar(255) not null,
                          descriptions varchar(255),
                          quantity int(10) not null,
                          price float(20) not null,
                          foreign key(userid) references registereduserdetail(userid),
                          foreign key(productid) references productdetail(productid)
                          );
                          
create table roles (roleid int(10) primary key not null auto_increment, rolename varchar(255) );
insert into roles (rolename) values ('user'), ('guest'),('admin');

