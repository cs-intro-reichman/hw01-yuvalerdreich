public class LinearEq {
	public static void main(String[] args) {
		
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		
		System.out.println(a + " * x + " + b + " = " + c);
		
		double x = (c - b) / a;
		
		System.out.println("x = " + x);
	}
}