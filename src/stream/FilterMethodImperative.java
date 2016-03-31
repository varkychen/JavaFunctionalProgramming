package stream;

import java.util.ArrayList;
import java.util.List;

public class FilterMethodImperative {
	public static void main(String[] args) {
		String[] animals = { "cats", "dogs", "ox", "bats", "horses", "mule" };
		List<String> list = new ArrayList<String>();
		for(String name : animals) {
			if(!name.matches(".*s$")) {
				list.add(name);
			}
		}
		
		list.sort(null);
		for(String name : list) {
			System.out.println(name);
		}
	}
}
