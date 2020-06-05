//How many times each word present in a sentence(word not letter)
package StringPrograms;
import java.util.*;
public class String13 
{
public static void main(String[] args) 
    {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Sentence ");
           String st = sc.nextLine();
           String word[] = st.split(" ");
           LinkedHashMap<String, Integer> wc = new LinkedHashMap<String,Integer>();
           for (int i = 0; i < word.length; i++) 
           {
			if(wc.containsKey(word[i]))
					{
				wc.put(word[i], wc.get(word[i])+1);
					}
			else
			{
				wc.put(word[i], 1);
			}
			}
			
			Set ent = wc.entrySet();
			for(Object obj : ent)
			{	
				/*Map.Entry e = (Map.Entry)obj;
				System.out.println(e.getKey()+"---->"+e.getValue());*/
				System.out.println(obj);
			}
		}
    }