package aji.learning.hexarch.adapter.outbound.repository.impl;

import aji.learning.hexarch.adapter.outbound.entity.BookEntity;
import aji.learning.hexarch.adapter.outbound.repository.BookRepository;
import aji.learning.hexarch.adapter.outbound.mapper.Mapper;
import aji.learning.hexarch.domain.model.BookData;
import aji.learning.hexarch.domain.port.outbound.BookRepositoryPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class BookImplRepository implements BookRepositoryPort {

    @Autowired
    private BookRepository repository;

    @Override
    public void borrowBook(BookData bookData) {
        log.info(" {} Borrowed book : {}", bookData.getBorrowBy(), bookData.getBookName());
        repository.save(Mapper.mapToEntity(bookData));
    }

    @Override
    public BookData trackBookById(String bookId) {
        BookEntity entity = repository.findById(bookId).orElseThrow();
        log.info("Book is borrowed by : {}", entity.getBorrowBy());
        return Mapper.mapToDomain(entity);
    }
}
