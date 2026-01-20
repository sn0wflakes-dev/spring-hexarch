package aji.learning.hexarch.adapter.inbound.rest.mapper;

import aji.learning.hexarch.adapter.inbound.rest.model.borrow.BorrowRequest;
import aji.learning.hexarch.adapter.inbound.rest.model.borrow.BorrowResponse;
import aji.learning.hexarch.adapter.inbound.rest.model.track.TrackResponse;
import aji.learning.hexarch.domain.model.BookData;

public class RestMapper {
    public static BookData borrowReqToDomain(BorrowRequest request) {
        return new BookData(
                request.bookId(),
                request.bookName(),
                request.borrowBy(),
                request.isBooked()
        );
    }

    public static BorrowResponse toBorrowResponse(BookData bookData) {
        return new BorrowResponse(
                bookData.getBookId(),
                bookData.getBookName(),
                "Success borrow book"
        );
    }

    public static TrackResponse toTrackResponse(BookData bookData) {
        return new TrackResponse(
                bookData.getIsBooked(),
                "Already borrowed"
        );
    }
}
