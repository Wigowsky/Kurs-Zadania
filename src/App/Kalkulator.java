package App;

import Logic.Działania;
import java.util.Locale;
import java.util.Scanner;

public class Kalkulator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();
        input.nextLine();
        System.out.println("Podaj klucz wybranego działania : Dod(+), Minus(-), Mnoż(*), Dziel(/)  ");
        String sign = input.nextLine();

        input.close();

        switch (sign) {
            case "Dod":
                System.out.println("Wynik dodawania :");
                Działania.Add( a, b);
                break;
            case "Minus":
                System.out.println("Wynik dodawania :");
                Działania.Minus( a, b);
                break;
            case "Mnoż":
                System.out.println("Wynik dodawania :");
                Działania.Multiply( a, b);
                break;
            case "Dziel":
                System.out.println("Wynik dodawania :");
                Działania.Divide( a, b);
                break;
        }
    }
}

/*
package app;

import java.util.Locale;
import java.util.Scanner;

import calc.Calculator;

public class CalcApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		double a = input.nextDouble();
		input.nextLine();
		String operator = input.nextLine();
		double b = input.nextDouble();

		Calculator calc = new Calculator();
		double result = calc.calculate(a, b, operator);
		System.out.println(a + operator + b + " = " + result);

		input.close();
	}
}
 */