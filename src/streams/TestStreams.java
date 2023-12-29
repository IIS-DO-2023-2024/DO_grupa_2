package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
	     List<Movie> movies = new ArrayList<>();
	     movies.add(new Movie("Titanik", 10));
	     movies.add(new Movie("Star Wars", 20));
	     movies.add(new Movie("The Godfather", 30));
	     
	     // Imperativno programiranje
	     int count = 0;
	     for(var movie : movies) 
	    	 if(movie.getLikes() > 10)
	    		 count++;
	     
	     // Deklarativno (funkcionalno) programiranje
	     var count2 = movies.stream();
	     count2.filter(movie -> movie.getLikes() > 10)
	     	   .count();
	     
// ZADATAK 1----------------------------------------
			int[] numbers = {1, 2, 3};
			//numbers.stream(); --> nema stream metod 
			Arrays.stream(numbers)
			.forEach(n -> System.out.println("Broj 1.zadatka:" + n));
			
// ZADATAK 2----------------------------------------
			var stream2 = Stream.generate(() -> Math.random());
			stream2
			.limit(4)
			.forEach(n -> System.out.println("Broj 2.zadatka:" + n));
			
// ZADATAK 3----------------------------------------
			Stream.iterate(1,  n -> n + 1)
			.limit(10)
			.forEach(n -> System.out.println(n));
			
	     
// ZADATAK 4----------------------------------------
	     System.out.println("--- Ispis naziva filmova: ---");
	     movies.stream()
	     .map(movie -> movie.getTitle())
	     .forEach(name -> System.out.println(name));
	     
	     // Streams listi
	     List<Integer> list1 = new ArrayList<>();
	     list1.add(1);
	     list1.add(5);
	     list1.add(10);
	        
		 List<Integer> list2 = new ArrayList<>();
		 list2.add(2);
		 list2.add(2);
		 list2.add(2);

	     System.out.println("--- Ispis listi uz pomoć stream-a: ---");
	     var stream_liste = Stream.of(list1, list2); 
	     stream_liste
	     .forEach(list -> System.out.println(list));
		 
	     // flatMap
	     System.out.println("--- Ispis elemenata svake liste: ---");
	     var stream_liste2 = Stream.of(list1, list2); 
	     stream_liste2
	     .flatMap(list -> list.stream())
	     .forEach(list -> System.out.println(list));
	     
// ZADATAK 5 - Filtriranje ----------------------------------------
	     System.out.println("--- Prvi način: ---");
	     movies.stream()
	     .filter(m -> m.getLikes() > 10)
	     .forEach(m -> System.out.println(m.getTitle()));
	     

	     System.out.println("--- Drugi način: ---");
	     Predicate<Movie> isPopular = m -> m.getLikes() > 10;
	     movies.stream()
	     .filter(isPopular)
	     .forEach(m -> System.out.println(m.getTitle()));
	     
	     
// ZADATAK 6 - Izdvajanje (slicing) elemenata -------------------------------------
	     System.out.println("--- Slicing: ---");
	     movies.stream()
	     .skip(2)
	     .forEach(m -> System.out.println(m.getTitle()));
	
// ZADATAK 7 - Sortiranje filmova -------------------------------------
    movies.add(new Movie("Home alone", 20));
    movies.add(new Movie("Forrest Gump", 15));
    
    System.out.println("--- Sortiranje po nazivu rastuće: ---");
    movies.stream()
    .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
    .forEach(m -> System.out.println(m.getTitle()));
    
    System.out.println("--- Sortiranje po nazivu opadajuće: ---");
    movies.stream()
    .sorted(Comparator.comparing(Movie::getTitle).reversed())
    .forEach(m -> System.out.println(m.getTitle()));
    

	
	}
	


}
