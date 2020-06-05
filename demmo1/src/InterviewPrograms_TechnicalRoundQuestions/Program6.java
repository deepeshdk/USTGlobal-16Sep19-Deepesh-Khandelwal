package InterviewPrograms_TechnicalRoundQuestions;
public class Program6 
{
	public static void main(String[] args) 
	{
       Program6 p = new Program6();
       p.m("hi ,i'm fourth");
       p.m(new Integer(1));
       p.m(2);
       //p.m(null);//The method m(String) is ambiguous for the type 
       //Program6
       p.m("hi,i,m fifth");
	}
	public void m(String s) 
	{
		System.out.println("hi,i'm first");
	}
	public void m(Integer i) 
	{
		System.out.println("hi,i'm second");
	}
	public void m(Object o) 
	{
		System.out.println("hi,i'm third");
	}
}