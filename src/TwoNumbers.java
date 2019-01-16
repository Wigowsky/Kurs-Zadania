import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();

        input.close();

        System.out.println("A+B=" + (a+b));
    }
}


/*
Znak białej linii po wczytaniu liczb

Z klasą Scanner wiąże się jedno dziwne zachowanie. Metody pozwalające na odczyt liczb takie jak nextInt(), czy nextDouble() pozwalają odczytać jedynie liczby, jednak nie "konsumują" znaku nowej linii "\n" który doklejany jest po wciśnięciu Entera. Jeśli więc bezpośrednio po wczytaniu liczby spróbujesz wczytać napis, to zobaczysz przeskoczenie do kolejnej instrukcji.
Jeżeli chcesz uniknąć sytuacji jaka występuje w powyższym przykładzie, to w programach mieszających wczytywanie liczb i napisów zawsze po instrukcjach takich jak nextInt(), czy nextDouble() wywołaj metodę nextLine() w celu "skonsumowania" znaku nowej linii.

import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //pobierz znak nowej linii \n
        sc.nextLine();
        //teraz możesz pobrać od użytkownika napis
        String word = sc.nextLine();
        //obie wartości zostają wyświetlone
        System.out.println(number);
        System.out.println(word);

        sc.close();
    }
}
 */