package aji.learning.hexarch.config;

import aji.learning.hexarch.domain.port.outbound.BookRepositoryPort;
import aji.learning.hexarch.domain.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBean {
    @Bean
    public BookService bookService(BookRepositoryPort bookRepositoryPort) {
        return new BookService(bookRepositoryPort);
    }
}
