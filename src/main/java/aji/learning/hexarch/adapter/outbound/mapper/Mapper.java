package aji.learning.hexarch.adapter.outbound.mapper;

import aji.learning.hexarch.adapter.outbound.entity.BookEntity;
import aji.learning.hexarch.domain.model.BookData;

public class Mapper {
    public static BookEntity mapToEntity(BookData bookData) {
        BookEntity entity = new BookEntity();
        entity.setBookId(bookData.getBookId());
        entity.setBookName(bookData.getBookName());
        entity.setBorrowBy(bookData.getBorrowBy());
        entity.setIsBooked(bookData.getIsBooked());
        return entity;
    }

    public static BookData mapToDomain(BookEntity entity) {
        BookData data = new BookData();
        data.setBookId(entity.getBookId());
        data.setBookName(entity.getBookName());
        data.setBorrowBy(entity.getBorrowBy());
        data.setIsBooked(entity.getIsBooked());
        return data;
    }
}
