package dev.sasespirkovski.labsemt181204.service.impl;

import dev.sasespirkovski.labsemt181204.model.Author;
import dev.sasespirkovski.labsemt181204.repository.AuthorRepository;
import dev.sasespirkovski.labsemt181204.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }
}