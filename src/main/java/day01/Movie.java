package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String movieTitle;
    private List<Actor> actors = new ArrayList<>();
    private int releaseDate;

    public Movie(String movieTitle, int releaseDate) {
        this.movieTitle = movieTitle;
        this.releaseDate = releaseDate;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int counter = 0;
        for (Actor act : actors
        ) {
            int age =releaseDate - act.getBirthDate();
            if ((age > 19) && (age < 30))
            {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Actor actor1 = new Actor("Jhon", 1990);
        Actor actor2 = new Actor("Jhony", 1991);
        Actor actor3 = new Actor("Jhonny", 1992);
        Actor actor4 = new Actor("Jhonneey", 1993);
        Movie movie = new Movie("A fal", 2015);
        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);
        movie.addActor(actor4);
        movie.actorsInTheirTwenties();
        System.out.println(movie.actorsInTheirTwenties());
    }
}
