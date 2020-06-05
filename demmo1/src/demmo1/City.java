package demmo1;

public class City 
{
    int pinCode;
    public City(int  p)
    {
    	this.pinCode = p;
    }
    
    @Override
    public  boolean equals(Object o)
    {
    	if(o instanceof City)
    	{
    		City temp = (City)o;
    	
    if(this.pinCode==temp.pinCode)
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
    	City c1 = new City(456335);
    	City c2 = new City(456331);
    	City c3 = new City(456335);
    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
    }
    }
