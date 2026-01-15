package com.andersenlab.nurlib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "books")
@ToString(exclude = "books")
public class Author {

    @Id
    @UuidGenerator
    @Column(name = "id")
    private UUID id;

    @Column(name = "full_name", nullable = false, length = 50)
    private String fullName;

    @Column(name = "nationality", nullable = false, length = 50)
    private String nationality;

    @Column(name = "birth", nullable = false)
    private LocalDate birthDate;

    @Column(name = "death")
    private LocalDate deathDate;

    @Column(name = "biography", length = 500)
    private String biography;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
