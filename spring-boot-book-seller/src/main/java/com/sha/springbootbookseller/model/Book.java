package com.sha.springbootbookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="title", nullable = false, length = 100)
    private String title;

    @Column(name ="description", nullable = false, length = 1000)
    private String description;

    @Column(name ="author", nullable = false, length = 100)
    private String author;

    @Column(name ="price", nullable = false)
    private String price;

    @Column(name ="createTime", nullable = false)
    private LocalDateTime createTime;
}
