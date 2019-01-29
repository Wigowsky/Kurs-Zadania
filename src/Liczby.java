import java.util.Scanner;

public class Liczby {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int suma=0;

        System.out.println("Podaj liczbę elementów :");

        int elementy=sc.nextInt();

        for (int i = 0; i < elementy; i++) {

            System.out.println("Podaj liczbę: ");
            suma=suma+sc.nextInt();


        }

        System.out.println(suma);
        sc.close();
    }
}


/* ALTERNATYWNIE
import java.util.Scanner;

public class SumNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj ile liczb chcesz zsumować: ");
		int numbers = sc.nextInt();

		int sum = 0;
		while(numbers-- > 0) {
			System.out.println("Podaj kolejną liczbę: ");
			sum = sum + sc.nextInt();
		}

		System.out.println("Suma wszystkich podanych liczb to: " + sum);
		sc.close();
	}
}

 */