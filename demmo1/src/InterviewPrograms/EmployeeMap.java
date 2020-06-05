package InterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Raju");
		map.put(102, "Kamal");
		map.put(103, "Raju");
		
		Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			int id = entry.getKey();
			String name = entry.getValue();
			if(name.contains("Raju"))
				System.out.println(id);
		}
		
	}

}
