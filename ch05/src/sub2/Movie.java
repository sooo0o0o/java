package sub2;

public class Movie {
	
	//속성
	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	//생성자
	public Movie(String title, String director, double rating, int availableSeats) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	//기능
	public boolean reserveSeat() {
		if(availableSeats>0) {
			availableSeats--;
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void cancelReservation() {
		availableSeats++;
	}
	
	public void showDetails() {
		
		System.out.println("------------------------------");
		System.out.println("영화 제목: " + title);
		System.out.println("감독 이름: " + director);
		System.out.println("영화 평점: " + rating);
		System.out.println("예약 가능한 좌석 수: " + availableSeats);
		System.out.println("------------------------------");
		
	}
		
		
	
	
}
