class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        double Add = calc.Add(2.5, 7.5);
        System.out.println(Add);

        Add = calc.Add(2.5, 7.5, 25);
        System.out.println(Add);

        double subtract = calc.subtract(2.5, 7.5);
        System.out.println(subtract);

        subtract = calc.subtract(2.5, 7.5, 10);
        System.out.println(subtract);

        double multiply = calc.multiply(2.5, 7.5);
        System.out.println(multiply);

        double divide = calc.divide(2.5, 7.5);
        System.out.println(divide);

    }
}

/*  Alternatywnie

class Calculate {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double a = 15;
		double b = 2.5;
		System.out.println("A = " + a + ", B = " + b);
		System.out.println("A+B = " + calc.add(a, b));
		System.out.println("A-B = " + calc.subtract(a, b));
		System.out.println("A*B = " + calc.multiply(a, b));
		System.out.println("A/B = " + calc.divide(a, b));
	}
}
 */