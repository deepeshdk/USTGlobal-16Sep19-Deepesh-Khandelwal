package InterviewPrograms_TechnicalRoundQuestions;
public class Program3 
{
	public static void main(String[] args)
	{
       String s1 = new String("Hello");//One in SCP and other in Heap
       String s2 = "Hello";//SCP
       System.out.println(s1==s2);//Comparing address
       System.out.println(s1.equals(s2));
       System.out.println("-----");
       int a=10;
       int b=10;
       System.out.println(a==b);
       System.out.println("-----");
       //System.out.println(a.equals(b));//Showing error
       //(Cannot invoke equals(int) on the primitive type int)
       String a1 = "abc";//Both are created in SCP
       String a2 = "abc";
       System.out.println(a1.equals(a2));
       System.out.println(a1==a2);
       System.out.println("------");
       String arr[]= {"meow","chau","mau"};//ALL created in SCP
       String a3="meow";//SCP
       System.out.println(arr[0]==a3);
	}

}
