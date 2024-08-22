package com.abhi.spring.docker.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Table(name = "BOOKS")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Books {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String author;
    private String category;
    private double price;
    private Date publishdate;
}
