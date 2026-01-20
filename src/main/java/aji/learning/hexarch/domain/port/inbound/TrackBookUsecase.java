package aji.learning.hexarch.domain.port.inbound;

import aji.learning.hexarch.domain.model.BookData;

public interface TrackBookUsecase {
    BookData trackBook(String bookId);
}
