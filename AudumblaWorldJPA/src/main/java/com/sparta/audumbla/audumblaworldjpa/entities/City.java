package com.sparta.audumbla.audumblaworldjpa.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "city", schema = "world")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Size(max = 35)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "Name", nullable = false, length = 35)
    private String name;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "District", nullable = false, length = 20)
    private String district;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "Population", nullable = false)
    private Integer population;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "CityEntity [id=" + id + ", name=" + name + ", district=" + district + "}";
    }
}
