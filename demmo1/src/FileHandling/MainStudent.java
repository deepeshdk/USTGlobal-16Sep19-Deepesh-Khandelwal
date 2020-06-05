package FileHandling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class MainStudent 
{
public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
       String res = null;
       Student.cCode=420;
       TreeSet<Student> ts = new TreeSet<Student>(); 
       do {
    	   System.out.println("Enter id name and perc");
    	   int id = sc.nextInt();
    	   String name = sc.next();
    	   double perc = sc.nextDouble();
    	   Student std = new Student(id, name, perc);
    	   ts.add(std);
    	   System.out.println("Do you have more Students: ");
    	   res  = sc.next();
       }while(res.equalsIgnoreCase("yes"));
          System.out.println("-:Students Information:-");   
          for (Student st : ts) 
          {
             System.out.println(st);			
		  }
          FileOutputStream fout = null;
          ObjectOutputStream obOut = null;
          try 
          {
        	  fout = new FileOutputStream("D:\\New File");
        	  obOut = new ObjectOutputStream(fout);
        	  
        	  obOut.writeObject(ts);
        	obOut.flush();
        	fout.flush();
        	System.out.println("Successfully Written");
          }
          catch(Exception e)
          {
        	  e.printStackTrace();
          }
	        finally
	        {
	        	try
	        	{
	        		obOut.close();
	        		fout.close();
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	        }
	}

}
