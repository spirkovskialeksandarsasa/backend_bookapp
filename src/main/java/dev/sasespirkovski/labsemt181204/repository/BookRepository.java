package dev.sasespirkovski.labsemt181204.repository;


import dev.sasespirkovski.labsemt181204.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
