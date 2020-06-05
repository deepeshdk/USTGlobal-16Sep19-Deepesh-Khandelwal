package InterviewPrograms;

public class CommonElement 
{
	public static void main(String[] args) 
	{
       int a[] = {0,3,8,9,7,5};
       int b[] = {3,9,5,6,1};
       for (int i = 0; i < a.length; i++)
       {
		  for (int j = 0; j < b.length; j++) 
		  {
			if(a[i]==b[j])
			{
				System.out.println(b[j]);
			}
		  }
       }
	}

}
