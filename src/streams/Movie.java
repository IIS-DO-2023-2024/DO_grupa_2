package streams;

public class Movie implements Comparable{
	private String title;
	private int likes;
	
	public Movie(String title, int likes) {
		this.title = title;
		this.likes = likes;
	}

	public int getLikes() {
		return likes;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}