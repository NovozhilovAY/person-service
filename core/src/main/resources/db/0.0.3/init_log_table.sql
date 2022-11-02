create table if not exists auth_log(
     id varchar(128) not null primary key,
     date varchar(20) not null,
     time varchar(20) not null,
     user_name varchar(40) not null
);