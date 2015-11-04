class LeapYear {
	public static void main(String[] args) {
		int year = 2012;
		if (year > 1581) {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("Year " + year + " is a leap-year.");
			} else {
				if (year % 400 == 0) {
					System.out.println("Year " + year + " is a leap-year.");
				} else {
					System.out.println("Year " + year + " is not a leap-year.");
				}
			}
		} else {
			System.out.println("The year number should be bigger than 1591.");
		}
	}
}