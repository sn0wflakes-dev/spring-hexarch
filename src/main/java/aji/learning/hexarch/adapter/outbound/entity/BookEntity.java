package aji.learning.hexarch.adapter.outbound.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class BookEntity {
    @Id
    private String bookId;

    private String bookName;
    private String borrowBy;
    private Boolean isBooked;
}
