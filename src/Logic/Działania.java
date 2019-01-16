package Logic;

public class Działania {

    public static void Add (double x, double y) {

       System.out.println(x+y);
    }

    public static void Minus (double x, double y) {

        System.out.println(x-y);
    }

    public static void Multiply (double x, double y) {

        System.out.println(x*y);
    }


    public static void Divide (double x, double y) {

        System.out.println(x/y);
    }


}

/*
package calc;

public class Calculator {
	public static final String PLUS = "+";
	public static final String MINUS = "-";
	public static final String MULTIPLY = "*";
	public static final String DIVIDE = "/";

	public double calculate(double a, double b, String operator) {
		double result = 0;

		switch (operator) {
		case PLUS:
			result = a + b;
			break;
		case MINUS:
			result = a - b;
			break;
		case MULTIPLY:
			result = a * b;
			break;
		case DIVIDE:
			result = a / b;
			break;
		default:
			System.out.println("Podany operator nie istnieje!");
		}

		return result;
	}
}
 */













  /*  Napisz prosty kalkulator dla liczb zmiennoprzecinkowych, który pozwala użytkownikowi kolejno na:

        Wprowadzenie pierwszej liczby,
        wprowadzenie jednego z podstawowych działań matematycznych (plus, minus, podziel, pomnóż) - w postaci znaków +, -, /, *,
        wprowadzenie drugiej liczby.

        Po czym wyświetlony jest wynik odpowiedniego działania.

        W programie wykorzystaj co najmniej dwie osobne klasy.

        */