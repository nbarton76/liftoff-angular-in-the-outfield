package com.flickfinder.flickfinderbackend.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private int apiMovieId;

    public AbstractMovie() {
    }

    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(Integer id) {this.movieId = id;}

    public int getApiMovieId() {
        return apiMovieId;
    }

    public void setApiMovieId(int apiMovieId) {
        this.apiMovieId = apiMovieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractMovie that)) return false;
        return movieId == that.movieId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId);
    }
}
