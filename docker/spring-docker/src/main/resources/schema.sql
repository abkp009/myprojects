drop table if exists books;
create table books (
  id SERIAL PRIMARY KEY,
  title VARCHAR(50) not null,
  author VARCHAR(50) not null,
  category VARCHAR(50),
  price float not null,
  publishdate timestamp with time zone
);