import by.gsu.lab2.Book;
import by.gsu.lab2.FictionBook;
import by.gsu.lab2.Science;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book books[] = new Book[]{
			new Book("Издатель 1", "Автор 1", 387),
			new FictionBook("Издатель 2", "Автор 2", "Жанр 1", 250),
			new Science("Издатель 3", "Автор 3", "Тема 1", "Легкая", 150),
			new Book("Издатель 4", "Автор 2", 512),
		};
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
