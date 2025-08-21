package me.escoffier.demo;

import io.quarkus.logging.Log;
import io.smallrye.common.annotation.RunOnVirtualThread;
import io.smallrye.reactive.messaging.MutinyEmitter;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RunOnVirtualThread
public class MovieController {

    @Channel("movies") MutinyEmitter<Movie> emitter;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        Log.info("Retrieving all movies");
        return Movie.listAll();
    }

    @PostMapping("/movies")
    @Transactional
    public Movie addMovie(Movie movie) {
        Log.info("Adding movie: " + movie.title);
        movie.persist();
        emitter.sendAndAwait(movie);
        return movie;
    }

    @DeleteMapping("/movies/{id}")
    @Transactional
    public void  deleteMovie(long id) {
        Log.info("Deleting movie: " + id);
        Movie.deleteById(id);
    }

}
