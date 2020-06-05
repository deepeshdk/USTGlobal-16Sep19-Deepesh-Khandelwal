package InterviewPrograms;
public class ObjectCount 
{
  static int count =0 ;
  ObjectCount()
  {
	  count++;
  }
//  static int getCount()
//  {
//	return count;
//  }
  public static void main(String[] args) 
  {
	ObjectCount oc = new ObjectCount();
	ObjectCount oc1 = new ObjectCount();
	ObjectCount oc2 = new ObjectCount();
	//int a = getCount();
	System.out.println(count);
  }
}
