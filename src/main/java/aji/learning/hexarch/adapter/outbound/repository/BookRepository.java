package aji.learning.hexarch.adapter.outbound.repository;

import aji.learning.hexarch.adapter.outbound.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, String> {
}
