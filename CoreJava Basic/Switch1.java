class Switch1
{
     public static void main(String args[])
     {
         char grade = 'A';
         switch(grade)
         {
         case 'A' : System.out.println("FCD");
                    break; 
         case 'B' : System.out.println("FC");
                    break;     
         case 'C' : System.out.println("SC");
                    break;     
         case 'D' : System.out.println("Just Pass");
                    break;     
         case 'E' : System.out.println("Fail");
                    break;     
         default : System.out.println("Invalid Grade");
          }
     }
}