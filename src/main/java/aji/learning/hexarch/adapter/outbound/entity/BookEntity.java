package aji.learning.hexarch.adapter.outbound.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class BookEntity {
    @Id
    @Column(name = "book_id", length = 255)
    private String bookId;

    @Column(name = "book_name", length = 500)
    private String bookName;

    @Column(name = "borrow_by", length = 255)
    private String borrowBy;

    @Column(name = "is_booked")
    private Boolean isBooked;
}
