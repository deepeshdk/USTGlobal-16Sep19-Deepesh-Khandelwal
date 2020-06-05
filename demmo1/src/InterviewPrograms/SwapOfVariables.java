package InterviewPrograms;
public class SwapOfVariables 
{
	public static void main(String[] args) 
	{
      int a =20;
      int b= 10;
      if(a!=b && a>0 && b>0)
      {
       a = a+b; 
       b = a-b;
       a = a-b;
       System.out.println("a = " +a);
       System.out.println("b = " +b);
      }
      if(a!=b&& a>0 && b>0)
      {
    	  a = a*b; 
          b = a/b;
          a = a/b;
          System.out.println("a = " +a);
          System.out.println("b = " +b);  
      }
      else
    	  System.out.println("Not validate input");
	}

}
