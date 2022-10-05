/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conectandobanco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author aluno
 */
public class TesteDatabase {

    public static void main(String[] args) {

        Database database = new Database();

        JdbcTemplate connection = database.getConnection();

//        connection.execute(;
//                "CREATE TABLE filme ("
//                + "id INT PRIMARY KEY AUTO_INCREMENT,"
//                + "nome VARCHAR(255) NOT NULL,"
//                + "ano_lancamento int NOT NULL"
//                + ");"
//        );

        connection.update("TRUNCATE TABLE filme;");
    
        connection.update("INSERT INTO filme VALUES(?, ?, ?);", 
            null, 
            "Titanic",
            1998
            );
       
        
//        System.out.println(connection.queryForList("SELECT * from filme"));

        List<Filme> resultado = connection.query("SELECT * from filme", 
                new BeanPropertyRowMapper(Filme.class));
        
        
        for (Filme filme : resultado) {
            
            System.out.println(filme.getNome());
        }
    }
}
