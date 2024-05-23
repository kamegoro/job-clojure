DROP TABLE IF EXISTS todos;

CREATE TABLE todos (id SERIAL PRIMARY KEY, title TEXT);
INSERT INTO todos (title) values('test1');
INSERT INTO todos (title) values('test2');