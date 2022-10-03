package slibrary;



public class Public_S_library {
private String addBook;
private String bookname;
private String genre;

static int count=0;
static int count2=0;

Teachers[] teacherList=new Teachers[100]; 
students[] studentlist = new students[100];
Public_S_library[]  bookslist = new Public_S_library[100];
static int count3;
public Public_S_library(String addBook, String bookname, String genre) {
	super();
	this.addBook = addBook;
	this.bookname = bookname;
	this.genre = genre;
}
public Public_S_library() {
	// TODO Auto-generated constructor stub
}
public String getAddBook() {
	return addBook;
}
public void setAddBook(String addBook) {
	this.addBook = addBook;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
@Override
public String toString() {
	return "Public_S_library [addBook=" + addBook + ", bookname=" + bookname + ", genre=" + genre + "]";
}




public void addNewStudent(students stu)
{
	studentlist[count++]=stu;
	
	
	}
public void viewStudentlist()
{
	for(int i =0;i<count;i++)
	{
		System.out.println("student list  : "+studentlist[i]);
	}

	
}

public void modifyStudentInfo(String id,String password)
{
	for(int i=0;i<count;i++)
	{
		if(studentlist[i].getLibraryStudentId ().equals(id))
		{
			studentlist[i].setPassword(password);
			break;
		}
	}

}
public void removeStudentById(String id)
{   int pos=-1;
	for(int i=0;i<count;i++)
	{
		if(studentlist[i].getLibraryStudentId().equals(id))
		{
			pos= i;
			break;
		}
	}
	for(int i=pos;i<count;i++)
	{
		studentlist[i] = studentlist[i+1];
		
	}
	if(pos>=0)
	{
		count--;
	}
	}

public void addNewTeacher(Teachers teacher)
{
	teacherList[count2++]=teacher;
	
	
	}
public void viewTeacherList()
{
	for(int i =0;i<count2;i++)
	{
		System.out.println("Book list  : "+teacherList[i]);
	}
	
	
	}

public void modifyTeacherInfo(String id,String password)
{
	for(int i=0;i<count2;i++)
	{
		if(teacherList[i].getLibraryTeacherId().equals(id))
		{
			teacherList[i].setPassword(password);
			break;
		}
	}

}
public void removeTeacherById(String id)
{   int pos=-1;
	for(int i=0;i<count2;i++)
	{
		if(teacherList[i].getLibraryTeacherId().equals(id))
		{
			pos= i;
			break;
		}
	}
	for(int i=pos;i<count2;i++)
	{
		teacherList[i] = teacherList[i+1];
		
	}
	if(pos>=0)
	{
		count2--;
	}
	}





public void addNewBook(Public_S_library pl)
{
	bookslist[count3++]=pl;
	
	
	}
public void viewBookList()
{
	for(int i =0;i<count3;i++)
	{
		System.out.println("BookList list  : "+bookslist[i]);
	}
	
	
	}
public void modifyBookInfo(String name)
{
	for(int i=0;i<count2;i++)
	{
		if(bookslist[i].getBookname().equals(name))
		{
			bookslist[i].setBookname(name);
			break;
		}
	}


}
}