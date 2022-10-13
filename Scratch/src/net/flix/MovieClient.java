package net.flix;

class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Halloween", 1978, 750_000_000.0, Rating.R, Genre.HORROR);
        System.out.println(movie1);

        Movie movie2 = new Movie("Atlantis");

        System.out.println(movie2);
    }
}