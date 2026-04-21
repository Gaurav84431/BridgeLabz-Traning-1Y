import java.util.*;

class MovieData {
    String name;
    double rating;
    int year;

    MovieData(String n, double r, int y) {
        name = n;
        rating = r;
        year = y;
    }
}

public class TopMoviesApp {
    public static void main(String[] args) {
        List<MovieData> list = Arrays.asList(
                new MovieData("A", 8.5, 2022),
                new MovieData("B", 9.1, 2023),
                new MovieData("C", 7.8, 2021),
                new MovieData("D", 9.5, 2024),
                new MovieData("E", 8.9, 2022),
                new MovieData("F", 9.0, 2023)
        );

        list.stream()
                .sorted((a, b) -> Double.compare(b.rating, a.rating))
                .limit(5)
                .forEach(m -> System.out.println(m.name + " " + m.rating));
    }
}