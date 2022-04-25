package dev.sasespirkovski.labsemt181204.service.impl;


import dev.sasespirkovski.labsemt181204.model.Author;
import dev.sasespirkovski.labsemt181204.model.Book;
import dev.sasespirkovski.labsemt181204.model.Category;
import dev.sasespirkovski.labsemt181204.repository.AuthorRepository;
import dev.sasespirkovski.labsemt181204.repository.BookRepository;
import dev.sasespirkovski.labsemt181204.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class BookServiceImpl implements BookService {

        private final BookRepository bookRepository;
        private final AuthorRepository authorRepository;

        public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
            this.bookRepository = bookRepository;
            this.authorRepository = authorRepository;
        }

        @Override
        public List<Book> findAll() {
            return this.bookRepository.findAll();
        }

        @Override
        public Optional<Book> findById(Long id) {
            return this.bookRepository.findById(id);
        }

        @Override
        public Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies) {
            Author author = this.authorRepository.findById(authorId).orElseThrow(RuntimeException::new);
            Book book = new Book(name, category, author, availableCopies);
            this.bookRepository.save(book);
            return Optional.of(book);
        }

        @Override
        public Optional<Book> edit(Long id, String name, Category category, Long authorId, Integer availableCopies) {
            Book book = this.bookRepository.findById(id).orElseThrow(RuntimeException::new);
            Author author = this.authorRepository.findById(authorId).orElseThrow(RuntimeException::new);
            book.setAuthor(author);
            book.setName(name);
            book.setCategory(category);
            book.setAvailableCopies(availableCopies);
            this.bookRepository.save(book);
            return Optional.of(book);
        }

        @Override
        public void markAsTaken(Long id) {
            Book book = this.bookRepository.findById(id).orElseThrow(RuntimeException::new);
            Integer availableCopies = book.getAvailableCopies() - 1;
            book.setAvailableCopies(availableCopies);
            this.bookRepository.save(book);
        }

        @Override
        public void deleteById(Long id) {
            this.bookRepository.deleteById(id);
        }
    }

