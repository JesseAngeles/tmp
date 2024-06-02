DROP DATABASE inventario;
CREATE DATABASE inventario;
USE inventario;

CREATE TABLE categoria (
    idCategoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreCategoria VARCHAR(50) NOT NULL,
    descripcionCategoria VARCHAR(250) NOT NULL
);

CREATE TABLE articulo (
    idArticulo BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreArticulo VARCHAR(50) NOT NULL,
    descripcionArticulo VARCHAR(250) NOT NULL,
    existencia INT NOT NULL,
    precio DOUBLE NOT NULL,
    idCategoria INT NOT NULL,
    FOREIGN KEY (idCategoria) REFERENCES categoria(idCategoria)
);

INSERT INTO categoria (nombreCategoria, descripcionCategoria)
VALUES 
    ('Ficción', 'Libros de ficción.'),
    ('No ficción', 'Libros de no ficción.'),
    ('Infantil', 'Libros para niños.'),
    ('Ciencia', 'Libros de ciencia.'),
    ('Historia', 'Libros de historia.'),
    ('Misterio', 'Libros de misterio.');

INSERT INTO articulo (nombreArticulo, descripcionArticulo, existencia, precio, idCategoria)
VALUES 
    ('El Hobbit', 'Una aventura en la Tierra Media.', 10, 19.99, 1), 
    ('Sapiens', 'Una breve historia de la humanidad.', 5, 25.50, 2), 
    ('Harry Potter', 'El niño que vivió.', 8, 12.75, 3), 
    ('Breve historia del tiempo', 'Exploración del universo.', 15, 8.99, 4), 
    ('El arte de la guerra', 'Estrategias y tácticas antiguas.', 20, 14.20, 5), 
    ('Sherlock Holmes', 'El detective más famoso.', 7, 22.10, 6),
    ('1984', 'Una novela distópica de George Orwell.', 12, 15.99, 1), 
    ('Educated', 'Una memoria de Tara Westover.', 7, 18.50, 2),
    ('Matilda', 'Una niña prodigio.', 10, 10.99, 3),
    ('El origen de las especies', 'Libro de Charles Darwin.', 5, 20.00, 4), 
    ('Los pilares de la Tierra', 'Una novela histórica de Ken Follett.', 8, 24.99, 5),
    ('El nombre de la rosa', 'Una novela de misterio de Umberto Eco.', 6, 22.99, 6),
    ('Cien años de soledad', 'Una novela de Gabriel García Márquez.', 10, 14.50, 1),
    ('El hombre en busca de sentido', 'Un libro de Viktor Frankl.', 7, 16.80, 2),
    ('El principito', 'Un cuento de Antoine de Saint-Exupéry.', 15, 9.99, 3),
    ('Cosmos', 'Un libro de Carl Sagan.', 5, 21.50, 4), 
    ('La sombra del viento', 'Una novela de Carlos Ruiz Zafón.', 9, 19.75, 1), 
    ('Cómo ganar amigos e influir sobre las personas', 'Un libro de Dale Carnegie.', 12, 13.20, 2),
    ('Alicia en el país de las maravillas', 'Un cuento de Lewis Carroll.', 10, 11.99, 3), 
    ('Breve historia de casi todo', 'Un libro de Bill Bryson.', 7, 18.25, 4), 
    ('El código Da Vinci', 'Una novela de misterio de Dan Brown.', 8, 20.99, 6);
