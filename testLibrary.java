package slibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;






public class testLibrary {

	public static void main(String[] args) throws IOException {
		
		char ch1;
		do
		{
       System.out.println("1 for Library  ");
       System.out.println("2 for Student  ");
       System.out.println("3 for Teacher ");
       System.out.println("Enter option 1/2/3  ");
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       int op = Integer.parseInt(bufferedReader.readLine());
       switch(op)
       {
       case 1:
    	  Public_S_library lib = new Public_S_library("Book Added","Huffman","Algorithm") ;
    	   char ch;
    	   do 
    	   {
    		   System.out.println("1 for Add Book in Library  ");
    	       System.out.println("2 for Registering Student in library  ");
    	       System.out.println("3 for Adding Teacher Details in Library ");
    	       System.out.println("Enter option 1/2/3  ");
    	       int op2 = Integer.parseInt(bufferedReader.readLine());
    	       switch(op2)
    	       {
    	       case 1:
    	       
    	       char ch2;
    	       do {
			

    	   System.out.println("1 for Add Book  ");
           System.out.println("2 for View Added Book List  ");
           System.out.println("3 for Modify Book Details ");
           

         
           System.out.println("Enter option 1/2/3");
           int op1 = Integer.parseInt(bufferedReader.readLine());
               switch(op1)
               {
               
               case 1:
            	   System.out.println("Enter comfirmation if yes only then Entered book name and Author will be added");
            	   Public_S_library li = new Public_S_library(bufferedReader.readLine(),bufferedReader.readLine(),bufferedReader.readLine());
            	   if(li.getAddBook().contentEquals("yes"))
            	   { lib.addNewBook(li);
            	   System.out.println("Book Added");}
            	   else System.out.println("NotAdded");
            	   break;
               case 2 :
            	   System.out.println("Added Booklist");
            	   lib.viewBookList();
            	   break;
               case 3 :
            	   System.out.println("Enter Exsisting book name");
            	   lib.modifyBookInfo(bufferedReader.readLine());
            	   break;
            	   default: System.out.println("Invalid Input");
               }
               System.out.println("Do you want to continue");
               ch2 = bufferedReader.readLine().charAt(0);
        		}while(ch2=='y'|| ch2 =='Y');
            break;
    	    
                 
          case 2:
    	       
    	       char ch3;
    	       do {
			

    	   System.out.println("1 for Register Student ");
           System.out.println("2 for View Added Student List  ");
           System.out.println("3 for Modify Student Details ");
           System.out.println("4 for unregistered student  Details ");

         
           System.out.println("Enter option 1/2/3/4 ");
           int op1 = Integer.parseInt(bufferedReader.readLine());
               switch(op1)
               {
               
               case 1:
            	   System.out.println("enter the Student Name Id No of books issed and Password");
            	   students st = new students(bufferedReader.readLine(), bufferedReader.readLine(),Integer.parseInt(bufferedReader.readLine()),bufferedReader.readLine());
            		if(st.getPassword().contains("stud"))
            		{ lib.addNewStudent(st);
            		System.out.println("Student registered");}
            		else {
            			System.out.println("Not Registered");
            		}
            	   break;
               case 2 :
            	   System.out.println("New registered Student list");
            	   lib.viewStudentlist();
            	   break;
               case 3 :
            	   System.out.println("Enter Exsisting Student Id And Password");
            	   lib.modifyStudentInfo(bufferedReader.readLine(),bufferedReader.readLine());
            	   break;
               case 4 :
            	   System.out.println("Enter Exsisting Student Id To Delete Student Information");
            	   lib.removeStudentById(bufferedReader.readLine());
            	   break;
            	   default: System.out.println("Invalid Input");
               }
               System.out.println("Do you want to continue");
               ch3 = bufferedReader.readLine().charAt(0);
        		}while(ch3=='y'|| ch3 =='Y');
            break;
          case 3:
   	       
   	       char ch4;
   	       do {
		  System.out.println("1 for Adding teacher Details ");
          System.out.println("2 for View Added teacher List  ");
          System.out.println("3 for Modify teacher Details ");
          

        
          System.out.println("Enter option 1/2/3 ");
          int op1 = Integer.parseInt(bufferedReader.readLine());
              switch(op1)
              {
              
              case 1:
            	  System.out.println("Enter the    Name  and id of the teacher NO of books Genre of book and password");
            	  Teachers t = new Teachers(bufferedReader.readLine(), bufferedReader.readLine(), Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine(), bufferedReader.readLine());
            	  System.out.println("confirm  Password");
            	  String confirm = bufferedReader.readLine();
            	   
            	  if(t.getPassword().contentEquals(confirm))
            	  {  lib.addNewTeacher(t);
            	  System.out.println("Teacher registered");}
            	  else {
            		  
            			  System.out.println("Not Registered");
            		  
				}
            	  
           	   break;
              case 2 :
            	 
            	  System.out.println("Registered teachers list");
            	   lib.viewTeacherList();
           	   break;
              case 3:
            	  System.out.println("Enter Exsisting teacher Id And Password");
           	   lib.modifyTeacherInfo(bufferedReader.readLine(),bufferedReader.readLine());
            	  break;
              
           	   default: System.out.println("Invalid Input");
              }
           	   System.out.println("Do you want to continue");
               ch4 = bufferedReader.readLine().charAt(0);
        		}while(ch4=='y'|| ch4 =='Y');
   	       
   	       
           	   break;
           	   default :System.out.println("Invalid Input");
    	       }
              
           	   System.out.println("Do you want to continue");
               ch = bufferedReader.readLine().charAt(0);
        		}while(ch=='y'|| ch =='Y');
    	   break;
           
       case 2:
    	   Public_S_library p = new Public_S_library();
    	   System.out.println("Enter the Name ID no of book issued and password");
    	   students s = new students(bufferedReader.readLine(), bufferedReader.readLine(),Integer.parseInt(bufferedReader.readLine()),bufferedReader.readLine());
    	   System.out.println("Student Library Penalty Details");
    	   System.out.println("Enter the Date in Format YYYY mm dd");
    	   p.addNewStudent(s);
    	   p.viewStudentlist();
    	   for(int i=0;i<s.getNoOfBooks();i++)
    	   {  System.out.println("penalty for book "+i);
    		   s.getDefaultdays();
    		   s.getPenalty();
    	   }
    	   
    	   break;
       case 3:
    	   Public_S_library pl = new Public_S_library();
    	  System.out.println("Enter the name id no of book issued  password");
    	   Teachers t = new Teachers(bufferedReader.readLine(), bufferedReader.readLine(), Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine(), bufferedReader.readLine());
     	 
    	   System.out.println("Student Library Penalty Details");
    	   System.out.println("Enter the Date in Format YYYY mm dd");
    	   pl.addNewTeacher(t);
    	   pl.viewTeacherList();	
    	   for(int i=0;i<t.getNoOfBook();i++)
    	   {  System.out.println("penalty for book "+i);
    		   t.getDefaultdays();
    		   t.getPenalty();
    	   }
    	   
    	   break;
       default :
    	   System.out.println("Enter Valid Option ");
       }
       System.out.println("Do you want to continue");
       ch1 = bufferedReader.readLine().charAt(0);
		}while(ch1=='y'|| ch1 =='Y');
	}
		

	}


