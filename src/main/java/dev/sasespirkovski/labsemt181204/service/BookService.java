package dev.sasespirkovski.labsemt181204.service;

import dev.sasespirkovski.labsemt181204.model.Book;
import dev.sasespirkovski.labsemt181204.model.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies);

    Optional<Book> edit(Long id, String name, Category category, Long authorId, Integer availableCopies);

    void markAsTaken(Long id);

    void deleteById(Long id);
}

