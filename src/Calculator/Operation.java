package Calculator;

public class Operation {
	double s;
	private double x;
	private double y;
	private String v;

	public Operation(double x, double y, String v) {
		this.x = x;
		this.y = y;
		this.v = v;
	}

	public void operation() {

		switch (v) {
		case "+":
			s = x + y;
			System.out.print("The Result of(" + x + " + " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		case "-":
			s = x - y;
			System.out.print("The Result of(" + x + " - " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		case "*":
			s = x * y;
			System.out.print("The Result of(" + x + " * " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		case "/":
			s = x / y;
			System.out.print("The Result of(" + x + " / " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		default:
			s = x % y;
			System.out.print("The Result of(" + x + " % " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();

		}
	}

	public void conti(double y, String v) {
		x = s;
		this.y = y;
		this.v = v;
		operation();

	}

}
