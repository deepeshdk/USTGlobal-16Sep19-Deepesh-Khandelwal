package FileHandling;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.TreeSet;
public class MainStudent1 
{
public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
     FileInputStream fin = new FileInputStream("D:\\New File");
     ObjectInputStream oin = new ObjectInputStream(fin);
     
         Object obj = oin.readObject();
         TreeSet<Student> ts = (TreeSet<Student>)obj;
         for(Student std : ts)
         {
        	 System.out.println(std);
         }
	}

}
