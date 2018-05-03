package by.gsu.lab2;

public class FictionBook extends Book{
	private String genre;

	public FictionBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FictionBook(String izd, String author, String genre, int pages) {
		super(izd, author, pages);
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}

	public FictionBook(String genre) {
		super();
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	 protected String getFullName() {
        return super.getFullName()+";"+genre; 
	}
}
