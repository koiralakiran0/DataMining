
public class Movie {

	int counter = 0;
	String rating_average;
	String genres;
	String keywords;
	String revenue;
	String overview;
	String rate_cnt;
	String popularity;
	String movie_id;
	String poster;
	String crew;
	String release_date;
	String cast;
	String studio;
	String budget;
	String title;
	String runtime;
	String homepage;
	String trailer;
	
	public Movie(String data) {
		data = data.replaceAll("\"", "");
		char[] dataChar = data.toCharArray();
		boolean replaceComma = false;
		for (int i = 0; i < data.length(); i++) {
			if (dataChar[i] == '[') {
				replaceComma = true;
			}
			if (dataChar[i] == ']') {
				replaceComma = false;
			}
			
			if (dataChar[i] == ',' && replaceComma == true) {
				dataChar[i] = ';';
			}
		}
		
		data = new String(dataChar);
		//System.out.println(data);
		String[] datas = data.split(",");
		rating_average = datas[0];
		genres = datas[1];
		keywords = datas[2];
		revenue = datas[3];
		overview = datas[4];
		rate_cnt = datas[5];
		popularity = datas[6];
		movie_id = datas[7];
		poster = datas[8];
		crew = datas[9];
		release_date = datas[10];
		cast = datas[11];
		studio = datas[12];
		budget = datas[13];
		title = datas[14];
		runtime = datas[15];
		homepage = datas[16];
		trailer = datas[17];
	}
	
	
	@Override
	public String toString() {
		return "movie_id = " + movie_id + " I " +
				"ratings = " + rating_average + " I " + 	
				"genres = " + genres + " I " + 
				"keywords = " + keywords + " I " + 
				"revenue = " + revenue + " I " + 
				"overview = " + overview + " I " + 
				"rate_cnt = " + rate_cnt + " I " + 
				"popularity = " + popularity + " I " + 
				"movie_id = " + movie_id + " I " + 
				"poster = " + poster + " I " + 
				"crew = " + crew + " I " + 
				"release_date = " + release_date + " I " + 
				"cast = " + cast + " I " + 
				"studio = " + studio + " I " + 
				"budget = " + budget + " I " + 
				"title = " + title + " I " + 
				"runtime = " + runtime + " I " +
				"homepage = " + homepage + " I " +
				"trailer = " + trailer + "\n***********************************************\n";
	}




}
