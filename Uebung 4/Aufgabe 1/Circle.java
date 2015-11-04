class Circle {

	Circle() {
		this.radius = 1.0;
		this.color = "black";
	}	

	Circle(double _radius) {
		this.radius = _radius;
		this.color = "black";
	}

	Circle(String _color) {
		this.radius = 1.0;
		this.color = _color;
	}

	Circle(double _radius, String _color) {
		this.radius = _radius;
		this.color = _color;
	}

	public void set_radius(double _radius) {
		this.radius = _radius;
	}

	public double get_radius() {
		return this.radius;
	}

	public void set_color(String _color) {
		this.color = _color;
	}

	public String get_color() {
		return this.color;
	}

	public void scale_circle(double _scale) {
		this.radius *= _scale;
	}

	public boolean is_bigger(Circle _circle) {
		return (this.radius > _circle.get_radius()) ? (true) : (false);
	}

	private double radius;
	private String color;

}