package com.flickfinder.flickfinderbackend.models.data;

import com.flickfinder.flickfinderbackend.models.WatchedMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchedMovieRepository extends CrudRepository<WatchedMovie, Integer> {
}
