import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetDataFromCSV {

	public static void main(String[] args) {
		String csv_location = "/Users/kiran/Desktop/movie_profiles.csv";
		ArrayList<Movie> list = new ArrayList<Movie>();
		try {
			Scanner getData = new Scanner(new File(csv_location));
			getData.nextLine();
			while (getData.hasNextLine()) {
				Movie movie = new Movie(getData.nextLine());
				System.out.println(movie);
				list.add(movie);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		for (int i = 0; i < list.size(); i ++) {
			//System.out.println(list.get(i));
		}
		
	}
}
