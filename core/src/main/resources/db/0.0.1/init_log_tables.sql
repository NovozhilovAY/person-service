
create table if not exists debug
(
    uuid varchar(50) not null primary key,
    system_type_id integer not null,
    method_params varchar(256) not null
);

create table if not exists exception
(
    uuid varchar(50) not null primary key,
    system_type_id integer not null,
    method_params varchar(256) not null
);