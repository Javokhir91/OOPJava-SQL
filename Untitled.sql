DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE Human_Friends;

USE Human_Friends;

CREATE TABLE animals(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50)
); 

INSERT INTO animals(name)
VALUES 	('pets_animals'),
		('puck_animals') 
;
--  
CREATE TABLE pets(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50),
	pets_id INT,
	FOREIGN KEY pets(pets_id) REFERENCES animals(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pets (name, pets_id)
VALUES ('dogs', 1);
--  

-- 
CREATE TABLE dogs(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50),
	birthday DATE,
	commands VARCHAR(50),
	type_animals INT,
	FOREIGN KEY (type_animals) REFERENCES pets (id) ON DELETE CASCADE ON UPDATE CASCADE 
);

INSERT INTO dogs(name, birthday, commands, type_animals) 
VALUES	('aaaaa', '2020-01-01', 'set, sad, sud', '1'),
		('Atrem', '2020-01-01', 'sit, smile', '1')
;

-- 

CREATE TABLE cats(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50),
	type_pets VARCHAR(50),
	birthday DATE,
	commands VARCHAR(50)
);


CREATE TABLE hamters(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50),
	type_pets VARCHAR(50),
	birthday DATE,
	commands VARCHAR(50)
);















































































































































































