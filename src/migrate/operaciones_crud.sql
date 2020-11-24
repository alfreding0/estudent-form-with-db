INSERT INTO estudiante (nombre, apellido, ci, sexo, telefono) VALUES ('nombre','apellido','ci','M','telefono');
UPDATE estudiante SET nombre='Alfredo', apellido='Gonzales Quiucha', ci='8611832', sexo='M', telefono='86823323' WHERE id=1;
DELETE from estudiante WHERE id=1;
SELECT * FROM estudiante;