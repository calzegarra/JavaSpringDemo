CREATE TABLE bddemo.TBPERSONA 
(NOMBRE CHAR (30), 
APELLIDO CHAR (30), 
CEDULA CHAR (10), 
FECHANACIMIENTO CHAR (10))    

ALTER TABLE bddemo.TBPERSONA ADD (
  CONSTRAINT PER_PK PRIMARY KEY (CEDULA))
  
CREATE TABLE bddemo.TBEMPLEADO
(id CHAR (10), 
 CEDULA CHAR (10),
 PUESTO CHAR (50), 
 AREA CHAR (50),
 USUARIO CHAR (20), 
 CLAVE CHAR (10)
 )  

ALTER TABLE bddemo.TBEMPLEADO ADD (
  CONSTRAINT EMP_PK PRIMARY KEY (ID))