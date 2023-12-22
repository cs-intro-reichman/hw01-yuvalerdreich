public class Coins {
	public static void main(String[] args) {
		
		int total = Integer.parseInt(args[0]);
		
		int quarters = total / 25;
		int remainder = total % 25;
		
		System.out.println("Use " + quarters + " quarters and " + remainder + " cents");
	}
}