package aji.learning.hexarch.domain.model;

import lombok.Data;

@Data
public class BookData {
    public BookData() {}
    public BookData(
            String bookId,
            String bookName,
            String borrowBy,
            Boolean isBooked) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.borrowBy = borrowBy;
        this.isBooked = isBooked;
    }

    private String bookId;
    private String bookName;
    private String borrowBy;
    private Boolean isBooked;
}
