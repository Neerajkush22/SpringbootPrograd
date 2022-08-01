package com.bookself.book.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BookDetails")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String bookName;
    @Column
    private String authorName;
}
