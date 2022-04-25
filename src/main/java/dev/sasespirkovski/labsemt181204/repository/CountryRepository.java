package dev.sasespirkovski.labsemt181204.repository;

import dev.sasespirkovski.labsemt181204.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{
}
