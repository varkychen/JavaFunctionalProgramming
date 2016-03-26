package functional.higher.order;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HigherOrderFunctions {
	public String processString(Function<String, String> operation, String target) {
		return operation.apply(target);
	}
	
	public static void main(String[] args) {
		String[] names = {"Varghese", "Paul", "Tintu", "Cherian", "Paul", "Varghese", "Zach", "Varghese"};
		List<String> nameList = Arrays.asList(names);
		
		
		HigherOrderFunctions functions = new HigherOrderFunctions();
		nameList.forEach(s->System.out.println(functions.processString(String::toLowerCase, s)));
	}
}
