package aji.learning.hexarch.domain.port.outbound;

import aji.learning.hexarch.domain.model.BookData;

public interface BookRepositoryPort {
    void borrowBook(BookData bookData);
    BookData trackBookById(String bookId);
}
