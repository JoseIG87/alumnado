SELECT tipodoc, documento, nombre, apellido, legajo
    	FROM alumno a, persona p
    	WHERE p.identificador = a.idpersona;

SELECT a.legajo, p.nombre, p.apellido, c.nombre AS "carrera", ic.fechainscripcion
	FROM alumno a INNER JOIN persona p ON a.idpersona = p.identificador
	INNER JOIN inscripciones_carrera ic ON a.identificador = ic.idalumno
	INNER JOIN carrera c ON ic.idcarrera=c.identificador 
	ORDER BY a.legajo DESC

SELECT ca.nombre AS "nombre carrera", cu.nombre 
	AS "nombre curso", COUNT(icu.idalumno) AS "cantidad alumnos", cu.cupomaximo 
	AS "cupo maximo curso" FROM curso cu INNER JOIN carrera ca 
	ON cu.idcarrera = ca.identificador INNER JOIN inscripciones_curso icu 
	ON cu.identificador = icu.idcurso GROUP BY cu.nombre, ca.nombre, cu.cupomaximo

SELECT ca.nombre AS "nombre carrera", cu.nombre 
	AS "nombre curso", COUNT(icu.idalumno) AS "cantidad alumnos", cu.cupomaximo 
	AS "cupo maximo curso" FROM curso cu INNER JOIN carrera ca 
	ON cu.idcarrera = ca.identificador INNER JOIN inscripciones_curso icu 
	ON cu.identificador = icu.idcurso GROUP BY cu.nombre, ca.nombre, cu.cupomaximo
	HAVING COUNT(icu.idalumno) > cu.cupomaximo

UPDATE curso SET cupomaximo = 
	CASE
		WHEN anio = 2018 AND cupomaximo < 5 THEN 10
		ELSE cupomaximo
    	END;

UPDATE inscripciones_curso
	SET fechainscripcion=current_timestamp
	FROM (SELECT icu.idalumno, icu.idcurso, icu.fechainscripcion 
		AS "fecha inscripcion cursada", ica.fechainscripcion AS "fecha inscripcion carrera"
		FROM inscripciones_curso icu INNER JOIN inscripciones_carrera ica
		ON icu.fechainscripcion < ica.fechainscripcion AND icu.idalumno = ica.idalumno) AS subquery
	WHERE inscripciones_curso.idcurso = subquery.idcurso 
	AND inscripciones_curso.idalumno = subquery.idalumno;

INSERT INTO persona VALUES (6,'DNI',34714285,'José Ignacio','Prieto','1989-11-04')
INSERT INTO alumno VALUES (6,6,'11010')

Yo considero que si se desea persistir un nuevo campo para la dirección de un alumno sería conveniente que ésta columna sea un atributo de la tabla persona, ya que una misma persona puede tener varios perfiles del tipo alumno a lo largo de su vida, con diferentes legajos e dentificadores, pero la dirección sera la misma para todos los perfiles. Es un atributo intrínseco a la persona, no alumno.

ALTER TABLE persona ADD COLUMN direccion VARCHAR(200)
