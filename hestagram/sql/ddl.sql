-- -----------------------------------------------------
-- Schema hestagram
-- -----------------------------------------------------
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `hestagram` DEFAULT CHARACTER SET utf8mb4 ;
USE `hestagram` ;

-- -----------------------------------------------------
-- Table `hestagram`.`User`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hestagram`.`User` ;

CREATE TABLE IF NOT EXISTS `hestagram`.`User` (
  `user_index` INT NOT NULL AUTO_INCREMENT,
  `nickname` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `id` VARCHAR(255) NOT NULL,
  `profile_picture` VARCHAR(255) NULL DEFAULT NULL,
  `description` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`user_index`),
  UNIQUE INDEX `user_index_UNIQUE` (`user_index` ASC) VISIBLE,
  UNIQUE INDEX `nickname_UNIQUE` (`nickname` ASC) VISIBLE,
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `hestagram`.`Content`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hestagram`.`Content` ;

CREATE TABLE IF NOT EXISTS `hestagram`.`Content` (
  `content_index` INT NOT NULL AUTO_INCREMENT,
  `user_index` INT NOT NULL,
  `user_content_index` INT NOT NULL,
  `photo` VARCHAR(255) NULL DEFAULT NULL,
  `update_time` TIMESTAMP NULL DEFAULT NULL,
  `content_text` VARCHAR(255) NULL DEFAULT NULL,
  `like_count` INT NULL DEFAULT 0,
  INDEX `user_index_idx` (`user_index` ASC) VISIBLE,
  PRIMARY KEY (`content_index`),
  CONSTRAINT `user_index`
    FOREIGN KEY (`user_index`)
    REFERENCES `hestagram`.`User` (`user_index`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `hestagram`.`Comment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hestagram`.`Comment` ;

CREATE TABLE IF NOT EXISTS `hestagram`.`Comment` (
  `content_index` INT NOT NULL,
  `comment_index` INT NOT NULL,
  `user_index` INT NOT NULL,
  `comment_text` VARCHAR(255) NULL DEFAULT NULL,
  `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`content_index`, `comment_index`, `user_index`),
  INDEX `user_index_idx` (`user_index` ASC) VISIBLE,
  CONSTRAINT `content_index`
    FOREIGN KEY (`content_index`)
    REFERENCES `hestagram`.`Content` (`content_index`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `user_index2`
    FOREIGN KEY (`user_index`)
    REFERENCES `hestagram`.`User` (`user_index`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `hestagram`.`Follow`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hestagram`.`Follow` ;

CREATE TABLE IF NOT EXISTS `hestagram`.`Follow` (
  `following_index` INT NOT NULL,
  `user_index` INT NOT NULL,
  PRIMARY KEY (`following_index`, `user_index`),
  CONSTRAINT `user_index3`
    FOREIGN KEY (`user_index`)
    REFERENCES `hestagram`.`User` (`user_index`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `hestagram`.`Hashtag`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hestagram`.`Hashtag` ;

CREATE TABLE IF NOT EXISTS `hestagram`.`Hashtag` (
  `tag_text` VARCHAR(255) NOT NULL,
  `content_index` INT NOT NULL,
  PRIMARY KEY (`content_index`, `tag_text`),
  CONSTRAINT `content_index2`
    FOREIGN KEY (`content_index`)
    REFERENCES `hestagram`.`Content` (`content_index`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `hestagram`.`Like`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hestagram`.`Like` ;

CREATE TABLE IF NOT EXISTS `hestagram`.`Like` (
  `content_index` INT NOT NULL,
  `user_index` INT NOT NULL,
  `commit_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`content_index`, `user_index`),
  INDEX `user_index_idx` (`user_index` ASC) VISIBLE,
  CONSTRAINT `user_index4`
    FOREIGN KEY (`user_index`)
    REFERENCES `hestagram`.`User` (`user_index`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `content_index3`
    FOREIGN KEY (`content_index`)
    REFERENCES `hestagram`.`Content` (`content_index`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;