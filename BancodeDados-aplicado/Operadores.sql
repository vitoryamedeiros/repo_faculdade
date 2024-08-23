--USE master;

--IF DB_ID('Exercicios') IS NOT NULL
--DROP DATABASE Exercicios;
--CREATE DATABASE Exercicios;
--GO

--USE Exercicios;
--CREATE TABLE Agenda (
--	Matricula INTEGER NOT NULL,
--	Nome VARCHAR(50) NOT NULL,
--	Nascimento DATE NOT NULL,
--	Sexo CHAR(1) NOT NULL,
--	Profissao VARCHAR(20) NOT NULL,
--	Salario MONEY
--);

--INSERT INTO Agenda (Matricula, Nome, Nascimento, Sexo, Profissao, Salario )
--	VALUES ( 1,'Maria Jose da Silva' ,'10/02/1980','F','Medico' ,1235.68 ),
--	( 2,'João Paulo dos Santos' ,'15/06/1982','M','Advogado' ,1546.50 ),
--	( 3,'Ana Maria das Neves' ,'05/08/1985','F','Engenheiro',2350.25 ),
--	( 4,'Silvana Maria Gonçalves','01/10/1988','F','Medico' ,NULL ),
--	( 5,'Ana Marisilva do Rego' ,'11/11/1983','F','Advogado' ,1500.00 ),
--	( 6,'Silva Santos Guedes' ,'02/03/1984','M','Engenheiro',1620.00 ),
--	( 7,'Carlos José dos Santos' ,'06/04/1986','M','Medico' ,NULL ),
--	( 8,'Pedro Paulo Marques' ,'17/06/1986','M','Advogado' ,1600.00 ),
--	( 9,'Antonio Carlos da Silva','08/06/1986','M','Engenheiro',1930.00 );


-- ---------- Ordenação ----------------
-- SELECT Matricula, Nome 
-- FROM Agenda
-- ORDER BY Nome;

--SELECT Profissao, Nome
--FROM Agenda
--ORDER BY Profissao, Nome DESC;

-- --------- Operadores Relacionais --------------
--SELECT * FROM Agenda WHERE Salario (<= , > , >= , = , <>) 2000;
--SELECT * FROM Agenda WHERE Salario <> 2000;


-- --------- Operadores Logicos --------------
--SELECT Profissao, Nome
--FROM Agenda
--WHERE Matricula IN (1,3,5);

--SELECT Profissao, Nome
--FROM Agenda
--WHERE Matricula NOT IN (1,3,5);
------------------------------
--SELECT Profissao, Nome
--FROM Agenda
--WHERE Matricula=1 OR Matricula=3 OR Matricula=5;

--SELECT Profissao, Nome
--FROM Agenda
--WHERE Matricula<>1 AND Matricula<>3 AND Matricula<>5;
---------------------------------
--SELECT Nome, Salario
--FROM Agenda
--WHERE Salario >= 1500 AND Salario <= 2000;

--SELECT Nome, Salario
--FROM Agenda
--WHERE Salario BETWEEN 1500 AND 2000;

--SELECT Nome, Salario
--FROM Agenda
--WHERE Salario < 1500 OR Salario > 2000;

--SELECT Nome, Salario
--FROM Agenda
--WHERE Salario NOT BETWEEN 1500 AND 2000;

--------------------------------
--SELECT Nome
--FROM Agenda
--WHERE Nome LIKE 'Silva%' OR
--	  Nome LIKE '% Silva %' OR
--	  Nome LIKE '% Silva'; 

--SELECT Nome
--FROM Agenda
--WHERE ' ' +Nome+ ' ' LIKE '% Silva %';

----------------------------------

--SELECT Nome, Salario
--FROM Agenda
--WHERE Salario is NULL;

--SELECT Nome, Salario
--FROM Agenda
--WHERE Salario is not NULL;


--------------------- GROUP BY (AGRUPAR POR)---------------------------

SELECT Profissao, COUNT(*)
FROM Agenda
GROUP BY Profissao
HAVING Profissao = 'Engenheiro';

----------------------------------------------

SELECT TOP(4) Nome, Salario
FROM Agenda
ORDER BY Salario DESC;

SELECT Nome, Salario
FROM Agenda
WHERE Salario = (SELECT MIN(Salario) FROM Agenda) OR
	  Salario = (SELECT MAX(Salario) FROM Agenda);
