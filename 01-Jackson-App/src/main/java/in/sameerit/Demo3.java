package in.sameerit;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo3 {
	
	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();

		map.put(101, "one");
		map.put(102, "two");
		map.put(103, "three");

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(104, "four");
		}
		
		System.out.println(map);

	}

}
