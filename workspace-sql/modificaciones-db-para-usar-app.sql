CREATE TABLE docente (
    identificador  integer PRIMARY KEY NOT NULL,
    idpersona	   integer REFERENCES persona (identificador) UNIQUE,
    legajo	       integer NOT NULL
);

ALTER TABLE curso
	ADD COLUMN iddocente integer REFERENCES docente (identificador) UNIQUE

ALTER TABLE inscripciones_curso
	ADD COLUMN fechafinalizacion DATE,
	ADD COLUMN notafinal NUMERIC(4,2);

ALTER TABLE inscripciones_carrera
	ADD COLUMN fechafinalizacion DATE;