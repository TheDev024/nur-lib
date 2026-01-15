package com.andersenlab.nurlib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "ISBN", nullable = false, unique = true, length = 13)
    private String isbn;

    @Column(name = "language", nullable = false, length = 3)
    private String language;

    @Column(name = "edition_no")
    private Integer editionNo;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "publisher", length = 50)
    private String publisher;

    @Column(name = "year")
    private Integer year;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id")
    )
    private List<Author> authors;
}
