class Mod {
	public static void main(String[] args) {
		int dividend = 14;
		int divisor = 10;
		if (dividend < 0 || divisor < 0) {
			System.out.println("Numbers should be positive.");
		} else {
			if (divisor == 0) {
				System.out.println("Division by zero.");
			} else {
				if (divisor > 10) {
					System.out.println("Divisor should smaller or equal than 10.");
				} else {
					int remainder = dividend % divisor;
					switch (remainder) {
						case 0:  System.out.println("Zero.");
								 break;
						case 1:  System.out.println("One.");
								 break;
						case 2:  System.out.println("Two.");
								 break;
						case 3:  System.out.println("Three.");
								 break;
						case 4:  System.out.println("Four.");
								 break;
						case 5:  System.out.println("Five.");
								 break;
						case 6:  System.out.println("Six.");
								 break;
						case 7:  System.out.println("Seven.");
								 break;
						case 8:  System.out.println("Eight.");
								 break;
						case 9:	 System.out.println("Nine.");
								 break;
						default: System.out.println("Something went horribly wrong.");
					}
				}
			}
		}
	}
}