package InterviewPrograms_TechnicalRoundQuestions;
import java.util.ArrayList;
import java.util.List;
public class Program1
{
	public static void main(String[] args) 
	{
      List lst = new ArrayList();
      lst.add(10);
      lst.add(10);
      System.out.println(lst.size());
      lst.remove(new Integer(10));
      System.out.println(lst.size());
	}

}
