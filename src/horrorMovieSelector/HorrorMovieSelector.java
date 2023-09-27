package horrorMovieSelector;
import java.util.Random;
public class HorrorMovieSelector {

	public static void main(String[] args) {
		String[] horrorMovies = {
	            "The Shining",
	            "The Exorcist",
	            "Psycho",
	            "Hereditary",
	            "Get Out"
				"The Purge"
	        };

	        // Create a random number generator
	        Random random = new Random();

	        // Generate a random index within the array bounds
	        int randomIndex = random.nextInt(horrorMovies.length);

	        // Get the randomly selected horror movie
	        String randomMovie = horrorMovies[randomIndex];

	        // Print the randomly selected horror movie
	        System.out.println("Randomly selected horror movie: " + randomMovie);

	}

}
