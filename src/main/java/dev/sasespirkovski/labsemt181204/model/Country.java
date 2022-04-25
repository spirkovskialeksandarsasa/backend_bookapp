package dev.sasespirkovski.labsemt181204.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlType;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    private String name;
    private String continent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }
}