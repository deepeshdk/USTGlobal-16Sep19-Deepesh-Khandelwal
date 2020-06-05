package InterviewPrograms_TechnicalRoundQuestions;
class A
{
	void m1()
	{
		System.out.println("a");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("b");
	}
}
class C extends B
{
	void m1()
	{
		System.out.println("c");
	}
}
class Program7
{
	public static void main(String[] args) 
	{
       A a = new B();
       a.m1();
       //C c = a;//Type mismatch: cannot convert from A to C
      // c.m1();
	}
}