package aji.learning.hexarch.domain.service;

import aji.learning.hexarch.domain.model.BookData;
import aji.learning.hexarch.domain.port.inbound.BorrowBookUsecase;
import aji.learning.hexarch.domain.port.inbound.TrackBookUsecase;
import aji.learning.hexarch.domain.port.outbound.BookRepositoryPort;

public class BookService implements BorrowBookUsecase, TrackBookUsecase {

    private final BookRepositoryPort bookRepositoryPort;

    public BookService(BookRepositoryPort bookRepositoryPort) {
        this.bookRepositoryPort = bookRepositoryPort;
    }

    @Override
    public void borrowBook(BookData bookData) {
        bookData.setIsBooked(true);
        bookRepositoryPort.borrowBook(bookData);
    }

    @Override
    public BookData trackBook(String bookId) {
        return bookRepositoryPort.trackBookById(bookId);
    }
}
