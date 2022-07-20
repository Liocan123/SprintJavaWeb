-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema para_java
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema para_java
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `para_java` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `para_java` ;

-- -----------------------------------------------------
-- Table `para_java`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `para_java`.`usuario` (
  `RUN` INT NOT NULL,
  `Nombre` VARCHAR(50) NOT NULL,
  `FechaDeNacimiento` VARCHAR(11) NOT NULL,
  `TipoDeUsuario` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`RUN`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `para_java`.`administrativo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `para_java`.`administrativo` (
  `IdAdministrativo` INT NOT NULL AUTO_INCREMENT,
  `IdUsuario` INT NOT NULL,
  `Area` VARCHAR(20) NOT NULL,
  `ExperienciaPrevia` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`IdAdministrativo`),
  INDEX `IdUsuario` (`IdUsuario` ASC) VISIBLE,
  CONSTRAINT `administrativo_ibfk_1`
    FOREIGN KEY (`IdUsuario`)
    REFERENCES `para_java`.`usuario` (`RUN`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `para_java`.`capacitacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `para_java`.`capacitacion` (
  `Identificador` INT NOT NULL AUTO_INCREMENT,
  `RutCliente` INT NOT NULL,
  `Dia` VARCHAR(9) NULL DEFAULT NULL,
  `Hora` VARCHAR(5) NULL DEFAULT NULL,
  `Lugar` VARCHAR(50) NOT NULL,
  `Duracion` VARCHAR(70) NULL DEFAULT NULL,
  `CantidadDeAsistentes` INT NOT NULL,
  PRIMARY KEY (`Identificador`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `para_java`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `para_java`.`cliente` (
  `IdCliente` INT NOT NULL AUTO_INCREMENT,
  `IdUsuario` INT NOT NULL,
  `RUT` INT NOT NULL,
  `Nombres` VARCHAR(30) NOT NULL,
  `Apellidos` VARCHAR(30) NOT NULL,
  `Telefono` VARCHAR(15) NOT NULL,
  `AFP` VARCHAR(30) NULL DEFAULT NULL,
  `SistemaDeSalud` INT NULL DEFAULT NULL,
  `FechaDeNacimiento` VARCHAR(11) NOT NULL,
  `Direccion` VARCHAR(70) NULL DEFAULT NULL,
  `Comuna` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`IdCliente`),
  INDEX `IdUsuario` (`IdUsuario` ASC) VISIBLE,
  CONSTRAINT `cliente_ibfk_1`
    FOREIGN KEY (`IdUsuario`)
    REFERENCES `para_java`.`usuario` (`RUN`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `para_java`.`profesional`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `para_java`.`profesional` (
  `IdProfesional` INT NOT NULL AUTO_INCREMENT,
  `IdUsuario` INT NOT NULL,
  `Titulo` VARCHAR(50) NOT NULL,
  `FechaDeIngreso` VARCHAR(11) NULL DEFAULT NULL,
  PRIMARY KEY (`IdProfesional`),
  INDEX `IdUsuario` (`IdUsuario` ASC) VISIBLE,
  CONSTRAINT `profesional_ibfk_1`
    FOREIGN KEY (`IdUsuario`)
    REFERENCES `para_java`.`usuario` (`RUN`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
