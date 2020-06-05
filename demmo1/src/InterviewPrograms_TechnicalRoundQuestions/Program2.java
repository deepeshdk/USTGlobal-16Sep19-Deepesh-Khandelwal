package InterviewPrograms_TechnicalRoundQuestions;
public class Program2 
{
	private static int increment(int i)//local scope of i
	{
		int num = (++i)+(i++);
		return num;
	}
	public static void main(String[] args)
	{
       for(int i=0;i<5;i=(new Program2()).increment(i)) //Solution
	  //for(int i=0;i<5;increment(i))//value will not come here
       {
    	   System.out.println(i);
       }
	}

}
