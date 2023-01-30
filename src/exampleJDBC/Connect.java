package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connect {

    private static String url = "jdbc:mysql://localhost:3307/floristeria";
    private static String user = "root";
    private static String pass = "";


    public static void main(String[] args){

        conectando();
    }

    static Connection connection;

    public static void conectando(){

        try {

            String sql = "INSERT INTO decoration (decoration_name, decoration_material, decoration_price, decoration_quantity) values ('deco1', 'deco', 2, 5)";
            connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}

/*
-- MySQL Workbench Synchronization
-- Generated: 2023-01-30 16:32
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Dario

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `floristeria` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `floristeria`.`decoration` (
  `decoration_id` INT(11) NOT NULL AUTO_INCREMENT,
  `decoration_name` VARCHAR(45) NOT NULL,
  `decoration_material` VARCHAR(45) NOT NULL,
  `decoration_price` DOUBLE NOT NULL,
  `decoration_quantity` INT(11) NOT NULL,
  PRIMARY KEY (`decoration_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

*/