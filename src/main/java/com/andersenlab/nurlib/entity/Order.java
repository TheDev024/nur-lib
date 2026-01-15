package com.andersenlab.nurlib.entity;

import com.andersenlab.nurlib.enums.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reader", nullable = false, length = 50)
    private String reader;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_order_book"))
    private Book book;

    @Enumerated
    @Column(name = "status", nullable = false)
    private OrderStatus status;

    @CreatedDate
    @Column(name = "date", nullable = false, updatable = false)
    private LocalDate date;

    @Column(name = "taken_at")
    private LocalDate takenAt;

    @Column(name = "returned_at")
    private LocalDate returnedAt;
}
