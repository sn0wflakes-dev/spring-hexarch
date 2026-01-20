package aji.learning.hexarch.domain.port.inbound;

import aji.learning.hexarch.domain.model.BookData;

public interface BorrowBookUsecase {
    void borrowBook(BookData bookData);
}
