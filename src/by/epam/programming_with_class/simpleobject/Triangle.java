package by.epam.programming_with_class.simpleobject;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания
//объектов, вычисления площади, периметра и точки пересечения медиан.

public class Triangle {
	public static void main(String[] args) {
		Point a = new Point(-1, -6);
		Point b = new Point(4, 9);
		Point c = new Point(5, 3);

		Triangle triangle = doingTriangle(a, b, c);

		double perimeter = triangle.findPerimeter();
		System.out.printf("периметр: %f.%n", perimeter);

		double area = triangle.findArea();
		System.out.printf("площадь: %f.%n", area);

		Point o = triangle.pointMedianIntersection();
		System.out.printf("координаты точки пересечения медиан: o(%f,%f).", o.getX(), o.getY());
	}
	
	private Side A;
	private Side B;
	private Side C;

	private Triangle(Side a, Side b, Side c) {
		A = a;
		B = b;
		C = c;
	}

	private static Triangle doingTriangle(Point a, Point b, Point c) {
		Side A = new Side(a, b);
		Side B = new Side(b, c);
		Side C = new Side(a, c);
		return new Triangle(A, B, C);
	}

	private double findPerimeter() {
		return A.calculateSide() + B.calculateSide() + C.calculateSide();
	}

	private double findArea() {
		double p = findPerimeter() / 2;
		return Math.sqrt(p * (p - A.calculateSide()) * (p - B.calculateSide()) * (p - C.calculateSide()));
	}

	private Point pointMedianIntersection() {
		double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
		double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
		return new Point(x, y);
	}
}

class Point {
	private double x;
	private double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}

class Side {
	private Point a;
	private Point b;

	Side(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	double calculateSide() {
		return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
	}
}
