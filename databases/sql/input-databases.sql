# sudo mysql -u root -p -D platzi_operation < ~/Desktop/input-databases.sql

CREATE DATABASE IF NOT EXISTS platzi_operation;

use platzi_operation;

show tables;


CREATE TABLE IF NOT EXISTS books (
	book_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	author_id INTEGER UNSIGNED,
	title VARCHAR(100) NOT NULL,
	year INTEGER UNSIGNED NOT NULL DEFAULT 1900,
	language VARCHAR(2) NOT NULL DEFAULT 'es' COMMENT 'ISO 639-1 Language',
	cover_url VARCHAR(500),
	price DOUBLE(6,2) NOT NULL DEFAULT 10.0,
	sellable TINYINT(1) DEFAULT 1,
	copies INTEGER NOT NULL DEFAULT 1,
	description TEXT
);

CREATE TABLE IF NOT EXISTS authors (
	author_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	nationality VARCHAR(3)
);

CREATE TABLE IF NOT EXISTS clients (
	client_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL UNIQUE,
	birthdate DATETIME,
	gender ENUM('M', 'F', 'ND') NOT NULL,
	active TINYINT(1) NOT NULL DEFAULT 1,
	created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
	 ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS operations (
	operation_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	book_id INTEGER UNSIGNED,
	client_id INTEGER UNSIGNED,
	type ENUM('soll', 'lend', 'available'),
	created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	finished TINYINT(1) NOT NULL
);




INSERT INTO authors(name, nationality)
VALUES('Gabriel García Márquez', 'COL'),
			('Juan Rulfo', 'MEX'),
			('Juan Gabriel Vasquez', 'COL');

INSERT INTO authors(name, nationality) VALUES
	('Isabel Allende 1', 'CHI'),
	('Isabel Allende 2', 'ARG'),
	('Isabel Allende 3', 'URU'),
	('Isabel Allende 4', 'BRA');

INSERT INTO authors(name, nationality) VALUES
  ('Octavio Paz', 'CHI');

insert into authors(name) values('Pablo Neruda2');

INSERT INTO clients(name, email, birthdate, gender, active) VALUES
	('Maria Dolores2', 'ghp2@gmail.com', '1978-06-06', 'F', 1);

INSERT INTO books(title, author_id) VALUES('El laberinto de la Soledad', 6);

INSERT INTO books(title, author_id, year)
VALUES('Vuelta al Laberinto de la Soledad',
	(SELECT author_id FROM authors
	WHERE name = 'Octavio Paz'
	LIMIT 1
	), 1960
);
