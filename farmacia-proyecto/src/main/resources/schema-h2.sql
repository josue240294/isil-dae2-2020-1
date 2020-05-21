create table vendedor (
id identity primary key,
nombre varchar(50) not null,
lastNameFather varchar(50) not null,
lastNameMother varchar(50) not null,
cargo varchar(50) not  null,
direccion varchar(50) not null,
telefono varchar(9) not null
);