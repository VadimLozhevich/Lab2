import by.gsu.lab2.Book;
import by.gsu.lab2.FictionBook;
import by.gsu.lab2.Science;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book books[] = new Book[]{
			new Book("�������� 1", "����� 1", 387),
			new FictionBook("�������� 2", "����� 2", "���� 1", 250),
			new Science("�������� 3", "����� 3", "���� 1", "������", 150),
			new Book("�������� 4", "����� 2", 512),
		};
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
