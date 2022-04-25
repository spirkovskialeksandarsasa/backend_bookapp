package dev.sasespirkovski.labsemt181204.repository;

import dev.sasespirkovski.labsemt181204.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
