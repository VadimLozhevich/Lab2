package by.gsu.lab2;

public class Book {
	private String izd;
	private String author;
	private int pages;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String izd, String author, int pages) {
		super();
		this.izd = izd;
		this.author = author;
		this.pages = pages;
	}
	public String getIzd() {
		return izd;
	}
	public void setIzd(String izd) {
		this.izd = izd;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	protected String getFullName(){
        return izd+";"+author;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		  return getFullName()+";"+pages;
	}
}
