create table if not exists STUDENTDATABASE(
    id int not null AUTO_INCREMENT,
    fname varchar(25) not null,
    lname varchar(25) not null,
    email varchar(225) not null,
    phone varchar(12) not null
);