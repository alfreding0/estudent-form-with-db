INSERT INTO estudiante (nombre, apellido, ci, sexo, telefono) VALUES ('Cecilio','Riojas Aguillera','83424','M','6984165');

UPDATE estudiante SET nombre='CECILIO', apellido='RIOJAS PACHECO', ci='8611832', sexo='M', telefono='7845451' WHERE id=1;

DELETE from estudiante WHERE id=1;

SELECT * FROM estudiante;