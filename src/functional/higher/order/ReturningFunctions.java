package functional.higher.order;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ReturningFunctions {

	public enum EmployeeType { HOURLY, SALARY, SALES}
	
	public BiFunction<Integer, Double, Double> calculatePayFunction(EmployeeType type) {
		switch(type) {
		case HOURLY: return (hours, payRate) -> hours * payRate;
		case SALARY: return (hours, payRate) -> 40 * payRate;
		case SALES:  return (hours, payRate) -> 500d + 0.15d * payRate;
		default: return null;
		}
	}

	public static void main(String[] args) {
		int[] hoursWorked = new int[] {8, 12, 8, 6, 6, 5, 6, 0};
		int totalHoursWorked = Arrays.stream(hoursWorked).sum();
		System.out.println("Number of hours worked: " + totalHoursWorked);
		
		ReturningFunctions rf = new ReturningFunctions();
		System.out.println(rf.calculatePayFunction(EmployeeType.HOURLY).apply(totalHoursWorked, 15.75d));
	}
}
