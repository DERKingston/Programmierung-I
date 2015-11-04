class Geometry {
	public static void main(String[] args) {
		Circle x1 = new Circle();
		Circle x2 = new Circle(1.5);
		Circle x3 = new Circle("yellow");
		Circle x4 = new Circle(2.7, "red");

		x2.set_color("brown");
		x3.set_radius(1.09);
		x4.scale_circle(0.4);

		System.out.println("Circle's #1 radius is " + x1.get_radius());
		System.out.println("Circle's #1 color is " + x1.get_color());
		System.out.println("Circle's #2 radius is " + x2.get_radius());
		System.out.println("Circle's #2 color is " + x2.get_color());
		System.out.println("Circle's #3 radius is " + x3.get_radius());
		System.out.println("Circle's #3 color is " + x3.get_color());
		System.out.println("Circle's #4 radius is " + x4.get_radius());
		System.out.println("Circle's #4 color is " + x4.get_color());
		
		if (x4.is_bigger(x3)) {
			System.out.println("Circle #4 is bigger than circle #3.");
		} else {
			System.out.println("Circle #4 is smaller than circle #3.");
		}
	}
}