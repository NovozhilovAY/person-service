create table if not exists users(
       id serial not null primary key,
       login varchar(128) not null,
       password varchar(128) not null
);

create table if not exists roles(
       id serial not null primary key,
       role varchar(32) not null
);

create table if not exists users_roles(
    user_id bigint not null references users(id),
    role_id bigint not null references roles(id)
);