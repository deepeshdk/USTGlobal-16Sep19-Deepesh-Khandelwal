public class Test1 {
    public static void main(String args[])
    {
       int a=20;
       int b=0;
       int result;
       try {
       result=a/b;
       System.out.println(result);
    }
       catch(ArithmeticException ai)
       {
    	   System.out.println("dividing by zero");
       }
}
}
