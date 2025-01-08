package sub2;

public class Book {
	
	//속성
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	//생성자
	
	public Book(String title, String author, String isbn, int availableCopies) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.availableCopies=availableCopies;
	}

	//메서드(기능)
	public boolean borrowBook() {
		
		if(availableCopies > 0) {
			availableCopies--;
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public void returnBook() {
		availableCopies++;
		
	}
	
	public void show() {
		
		System.out.println("------------------------------");
		System.out.println("도서명 : "+title);
		System.out.println("저자 이름 : "+author);
		System.out.println("ISBN 번호 : "+isbn);
		System.out.println("이용 가능한 복사본 : "+availableCopies);
		System.out.println("------------------------------");
	}
	
	//getter, setter
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public int availableCoies() {
		return availableCopies;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setavalableCopies(int availablecopies) {
		this.availableCopies = availablecopies;
	}
	

}
