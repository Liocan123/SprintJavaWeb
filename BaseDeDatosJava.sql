-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema test_java
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema test_java
-- -----------------------------------------------------
CREATE SCHEMA test_java;
use test_java;

-- -----------------------------------------------------
-- Table `test_java`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test_java`.`usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `run` INT NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `fechaDeNacimiento` VARCHAR(11) NOT NULL,
  `tipoDeUsuario` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `test_java`.`administrativo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test_java`.`administrativo` (
  `idAdministrativo` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NOT NULL,
  `area` VARCHAR(20) NOT NULL,
  `experienciaPrevia` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`IdAdministrativo`, `IdUsuario`),
  INDEX `as_us_idx` (`IdUsuario` ASC) VISIBLE,
  CONSTRAINT `as_us`
    FOREIGN KEY (`IdUsuario`)
    REFERENCES `test_java`.`usuario` (`idUsuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `test_java`.`capacitacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test_java`.`capacitacion` (
  `identificador` INT NOT NULL AUTO_INCREMENT,
  `rutCliente` INT NOT NULL,
  `dia` VARCHAR(9) NULL DEFAULT NULL,
  `hora` VARCHAR(5) NULL DEFAULT NULL,
  `lugar` VARCHAR(50) NOT NULL,
  `duracion` VARCHAR(70) NULL DEFAULT NULL,
  `cantidadDeAsistentes` INT NOT NULL,
  PRIMARY KEY (`Identificador`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `test_java`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test_java`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NOT NULL,
  `rut` INT NOT NULL,
  `nombres` VARCHAR(30) NOT NULL,
  `apellidos` VARCHAR(30) NOT NULL,
  `telefono` VARCHAR(15) NOT NULL,
  `afp` VARCHAR(30) NULL DEFAULT NULL,
  `sistemaDeSalud` INT NULL DEFAULT NULL,
  `fechaDeNacimiento` VARCHAR(11) NOT NULL,
  `direccion` VARCHAR(70) NULL DEFAULT NULL,
  `comuna` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`IdCliente`, `IdUsuario`),
  INDEX `cl_us_idx` (`IdUsuario` ASC) VISIBLE,
  CONSTRAINT `cl_us`
    FOREIGN KEY (`IdUsuario`)
    REFERENCES `test_java`.`usuario` (`idUsuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `test_java`.`profesional`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `test_java`.`profesional` (
  `idProfesional` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NOT NULL,
  `titulo` VARCHAR(50) NOT NULL,
  `fechaDeIngreso` VARCHAR(11) NULL DEFAULT NULL,
  PRIMARY KEY (`IdProfesional`, `IdUsuario`),
  INDEX `pr_us_idx` (`IdUsuario` ASC) VISIBLE,
  CONSTRAINT `pr_us`
    FOREIGN KEY (`IdUsuario`)
    REFERENCES `test_java`.`usuario` (`idUsuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) values ( '16232223','Pepe López', '01-01-1993', 'Cliente' );
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) values ('15943970', 'Juanito Morrego', '04-01-1981',  'Profesional');
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) values ('14589007','Mono Pitonizo', '08-09-1976',  'Administrativo');
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) values ('13006775', 'Animal Razonable', '07-05-1971', 'Cliente');
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) values ('14589007', 'Loco Odioso', '08-11-1965', 'Profesional');
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario)  values ('16599111','Camello Verde', '27-07-1986', 'Administrativo');
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) values ('130065', 'Animal Razonable1', '07-05-1971', 'Cliente');
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) values ('145007', 'Loco Odioso2', '08-11-1965', 'Profesional');
insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario)  values ('165111','Camello Verde3', '27-07-1986', 'Administrativo');

insert into Cliente (idUsuario, rut, nombres, apellidos, telefono, afp, sistemaDeSalud, fechaDeNacimiento, direccion, comuna) values ('1', '9999999', 'Pepe','López','+5657882', 'vital','1','12-12-1998','mi casa','Peru');
insert into Cliente (idUsuario, rut, nombres, apellidos, telefono, afp, sistemaDeSalud, fechaDeNacimiento, direccion, comuna) values ('4', '12345678', 'Arnold','Sotito','+5657882', 'Lucrum','2','29-11-1995','tu casa','Putaendo');
insert into Cliente (idUsuario, rut, nombres, apellidos, telefono, afp, sistemaDeSalud, fechaDeNacimiento, direccion, comuna) values ('7', '123678', 'Arno','totito','+5655882', 'cucruxm','2','29-11-1995','mi casa','Putaendo');

insert into profesional (idUsuario, titulo, fechaDeIngreso) values ('2', 'Ingeniero en PPT', '05-04/2022');
insert into profesional (idUsuario, titulo, fechaDeIngreso) values ('5', 'Ingeniero en Excel', '12-08/2020');
insert into profesional (idUsuario, titulo, fechaDeIngreso) values ('8', 'Ingeniero en completos', '12-08/2012');


insert into Administrativo (idUsuario, area, experienciaPrevia) values ('3','Operaciones', 'Cuatro años');
insert into Administrativo (idUsuario, area, experienciaPrevia) values ('6', 'Comercial', 'Dos años');
insert into Administrativo (idUsuario, area, experienciaPrevia) values ('9', 'Control de Gestion', 'tres años');