package com.abhi.spring.docker.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "BOOKS")
@Entity
@Data
public class Books {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String author;
    private String category;
    private double price;

}
