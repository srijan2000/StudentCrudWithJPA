CREATE SCHEMA `studentdb` ;

CREATE TABLE `studentdb`.`student` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `roll_number` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `discipline` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));