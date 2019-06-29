package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoviesTitlesIteration {

    public String getMovieTitles() {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> booksTitlesWithTranslations = movieStore.getMovies();

        return booksTitlesWithTranslations.entrySet().stream()
                .map(moviesTitle -> moviesTitle.getValue())
                .flatMap(movieTitle -> movieTitle.stream())
                .collect(Collectors.joining(" ! ","\"","\""));
    }
}
