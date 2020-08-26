package Ex171101;

/* 생성자 오버로딩 예 6
 * static, private */
public class Book {
	private String title;
	private String author;
	int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println(this.title + ":" + this.author + ":" + this.ISBN);
	}

	public Book(String title, int ISBN) {
		this(title, "Anonymous", ISBN);
	}

	public Book() {
		this(null, null, 0);
		System.out.println("생성자가 호출됨");
	}

	public static void main(String[] args) {
		Book java = new Book("JAVA", "이병일", 27);
		Book Holybible = new Book("Holly", 1);
		Book empty = new Book();

	}

}

