package slibrary;


import java.util.*;
import java.util.concurrent.TimeUnit;

public class Teachers implements Library {
	private String libraryTeacherId;
	private String teacherName;
	private int  noOfBook;
	private String genre;
	private Date dateOfReturn;
	private Date dateOfIssue;
	private long defaultDays;
	private String password;
	
	public Teachers(String teacherName,String libraryTeacherId,  int noOfBook, String genre,String password) {
		super();
		this.libraryTeacherId = libraryTeacherId;
		this.teacherName = teacherName;
		this.noOfBook = noOfBook;
	 	this.genre = genre;
	 	this.password = password;
	}
	public String getLibraryTeacherId() {
		return libraryTeacherId;
	}
	public void setLibraryTeacherId(String libraryTeacherId) {
		this.libraryTeacherId = libraryTeacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getNoOfBook() {
		return noOfBook;
	}
	public void setNoOfBook(int noOfBook) {
		this.noOfBook = noOfBook;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void getPenalty() {
		double penalty=0.0;;
		// TODO Auto-generated method stub
		if(defaultDays>30)
		{ penalty =  defaultDays*2;}
		System.out.println("Penalty need to be paid  =  "+penalty);
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void getDefaultdays() {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter date of return");
			dateOfReturn = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());   
			System.out.println("enter date of issue ");
	       dateOfIssue = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());   
		long retruninMS = dateOfReturn.getTime();
		long issueinMS = dateOfIssue.getTime();
		long defaultTime = Math.abs(retruninMS-issueinMS);
		 defaultDays = TimeUnit.DAYS.convert(defaultTime,TimeUnit.MILLISECONDS);
		sc.close();
		}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Teachers [libraryTeacherId=" + libraryTeacherId + ", teacherName=" + teacherName + ", noOfBook="
				+ noOfBook + ", password=" + password + " genre ="+genre+"]";
	}
	

}
