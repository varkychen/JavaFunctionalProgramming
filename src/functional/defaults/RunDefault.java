package functional.defaults;

public class RunDefault {
	public static void main(String[] args) {
		Computable computable = new ComputeImpl();
		System.out.println(computable.compute());
	}
}
