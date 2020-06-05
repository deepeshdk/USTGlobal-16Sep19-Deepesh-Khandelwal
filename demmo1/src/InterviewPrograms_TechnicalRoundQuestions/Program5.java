package InterviewPrograms_TechnicalRoundQuestions;
public class Program5 
{
	public static void main(String[] args) 
	{
       System.out.println(m(100));
	}
      private static int m(int i)
      {
    	  try 
    	  {
    		  System.out.println("hi,i'm try");
    		  int x=i/0;
    		  return x;
    	  }catch(Exception e) {
    		  System.out.println("hi,i'm catch");
    	  }finally {
    		  System.out.println("hi,i'm finally");
    	  }
    	  return i;//100
      }
}
