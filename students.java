package slibrary;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class students   implements Library{
	private String studentName;
	private String libraryStudentId;
	private Date  dateOfIssue;
	private Date dateOfReturn;
	private int     noOfBooks;
	long defaultDays;
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public students(String studentName,String libraryStudentId, int noOfBooks,String password) {
		super();
		this .studentName = studentName;
		this.libraryStudentId = libraryStudentId;
		
		this.noOfBooks = noOfBooks;
		this.password = password;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getLibraryStudentId() {
		return libraryStudentId;
	}
	public void setLibraryStudentId(String libraryStudentId) {
		this.libraryStudentId = libraryStudentId;
	}

	
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return "students [libraryStudentId=" + libraryStudentId + ", dateOfIssue=" + dateOfIssue + ", dateOfReturn="
				+ dateOfReturn + ", noOfBooks=" + noOfBooks + "]";
	}

	@Override
	public void getPenalty() {
		double penalty=0.0;;
		// TODO Auto-generated method stub
		if(defaultDays>15)
		{ penalty =  defaultDays*1.5;}
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


	
	

}
