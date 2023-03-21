SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
-- -----------------------------------------------------
-- Schema mensajeria_express
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mensajeria_express` DEFAULT CHARACTER SET utf8 ;
USE `mensajeria_express` ;

-- -----------------------------------------------------
-- Table `mensajeria_express`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mensajeria_express`.`Cliente` (
  `cedula_cliente` INT NOT NULL,
  `nombre_cliente` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(50) NOT NULL,
  `apellido2` VARCHAR(50) NULL,
  `celular` VARCHAR(10) NULL,
  `correo_electronico` VARCHAR(45) NULL,
  `direccion` VARCHAR(100) NULL,
  `ciudad` VARCHAR(50) NULL,
  PRIMARY KEY (`cedula_cliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mensajeria_express`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mensajeria_express`.`Empleado` (
  `cedula_empleado` INT NOT NULL,
  `nombre_empleado` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45) NULL,
  `celular` VARCHAR(10) NULL,
  `correo_electronico` VARCHAR(45) NULL,
  `direccion_residencia` VARCHAR(100) NULL,
  `ciudad` VARCHAR(45) NULL,
  `antiguedad_empresa` INT NULL,
  `rh` VARCHAR(5) NULL,
  `tipo_empleado` VARCHAR(45) NULL,
  PRIMARY KEY (`cedula_empleado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mensajeria_express`.`Paquete`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mensajeria_express`.`Paquete` (
  `id_paquete` INT NOT NULL AUTO_INCREMENT,
  `tipo_paquete` VARCHAR(45) NULL,
  `peso` INT NULL,
  `valor_declarado` INT NULL,
  PRIMARY KEY (`id_paquete`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mensajeria_express`.`Envio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mensajeria_express`.`Envio` (
  `numero_guia` INT NOT NULL,
  `cliente` INT NOT NULL,
  `ciudad_origen` VARCHAR(50) NULL,
  `ciudad_destino` VARCHAR(50) NULL,
  `direccion_destino` VARCHAR(100) NULL,
  `nombre_recibe` VARCHAR(45) NULL,
  `celular_recibe` VARCHAR(10) NULL,
  `hora_entrega` VARCHAR(45) NULL,
  `estado_envio` VARCHAR(45) NULL,
  `valor_envio` VARCHAR(45) NULL,
  `paquete` INT NULL,
  PRIMARY KEY (`numero_guia`),
  INDEX `id_paquete_idx` (`paquete` ASC),
  INDEX `cedula_cliente_idx` (`cliente` ASC),
  CONSTRAINT `id_paquete`
    FOREIGN KEY (`paquete`)
    REFERENCES `mensajeria_express`.`Paquete` (`id_paquete`)
    ON DELETE NO ACTION
    ON UPDATE SET NULL,
  CONSTRAINT `cedula_cliente`
    FOREIGN KEY (`cliente`)
    REFERENCES `mensajeria_express`.`Cliente` (`cedula_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
