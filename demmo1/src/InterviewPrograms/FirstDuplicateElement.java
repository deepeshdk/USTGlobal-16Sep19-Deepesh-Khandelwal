package InterviewPrograms;
public class FirstDuplicateElement 
{
	public static void main(String[] args) 
	{
	  //boolean found = false;
       int a[]= {0,2,6,5,6,9,7,5};
       for (int i = 0; i < a.length; i++) 
       {
		 for (int j = i+1; j < a.length; j++) 
		 {
			if(a[i]==a[j])
			{
				//found = true;
				System.out.println("Element is "+a[i]+" position "+(i+1)+
						" and "+(j+1));
				System.exit(0);
			}
			//if(found)
			//break;
		 }
		// if(found)
		// break;
	   }
	}

}
