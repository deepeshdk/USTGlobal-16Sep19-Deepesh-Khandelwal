package demmo1;

public class Product 
{
        String barcode;
        
       public  Product(String b)
         {
        	this.barcode = b; 
         }
        @Override
           public boolean equals(Object o)
           {
        	if(o instanceof Product)
        	{
        		Product temp = (Product)o;
        	if(this.barcode.equals(temp.barcode))
        	{
        		return true;
        	}
        	else 
        	{
        	   return false;	
        	}
        	}
        	else
        	{
        		return false;
        	}
        	}
           
        public static void main(String[] args)
        {
        	Product p1 = new Product("123");
        	Product p2 = new Product("321");
        	Product p3 = new Product("123");
           System.out.println(p1.equals(p2));	
           System.out.println(p1.equals(p3));
        }
       }
