-- Script para el ejercicio tipo prueba (JavaFX + MySQL)
-- Base de datos usada en DatabaseConnection: personas_fx

CREATE DATABASE IF NOT EXISTS personas_fx;
USE personas_fx;

DROP TABLE IF EXISTS persona;

-- Tabla única para Docente y Estudiante (herencia en una sola tabla).
-- La columna "tipo" indica qué subclase es cada fila.
CREATE TABLE persona (
    id                  INT AUTO_INCREMENT PRIMARY KEY,
    tipo                ENUM('DOCENTE', 'ESTUDIANTE') NOT NULL,
    nombre              VARCHAR(100) NOT NULL,
    edad                INT NOT NULL,
    casado              BOOLEAN NOT NULL DEFAULT FALSE,
    -- Solo para DOCENTE
    titulo_profesional  VARCHAR(100) NULL,
    sueldo              INT NULL,
    -- Solo para ESTUDIANTE
    nivel_conocimientos VARCHAR(50) NULL
);

-- 5 registros de ejemplo
INSERT INTO persona (tipo, nombre, edad, casado, titulo_profesional, sueldo, nivel_conocimientos) VALUES
('DOCENTE',    'Ana Torres',     45, TRUE,  'Ingeniera en Informática', 1800000, NULL),
('DOCENTE',    'Carlos Muñoz',   38, FALSE, 'Profesor de Matemáticas',  1500000, NULL),
('ESTUDIANTE', 'Valentina Rojas', 20, FALSE, NULL, NULL, 'Básico'),
('ESTUDIANTE', 'Matías Soto',    23, FALSE, NULL, NULL, 'Intermedio'),
('ESTUDIANTE', 'Javiera Pérez',  27, TRUE,  NULL, NULL, 'Avanzado');

SELECT * FROM persona;
