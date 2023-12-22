public class Triangle {
	public static void main(String[] args) {
		
		int side1 = Integer.parseInt(args[0]);
		int side2 = Integer.parseInt(args[1]);
		int side3 = Integer.parseInt(args[2]);
		
		int sum1 = side1 + side2;
		int sum2 = side1 + side3;
		int sum3 = side2 + side3;
		
		boolean isTriangle = (sum1 > side3) && (sum2 > side2) && (sum3 > side1);
		
		System.out.println(side1 + " , " + side2 + " , " + side3 + ": " + isTriangle);
	}
}