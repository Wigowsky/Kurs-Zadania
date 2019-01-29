import java.util.Scanner;

class ForEachProblem {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę");
            numbers[i] = sc.nextInt();
        }

        for (int tmp : numbers) {
            System.out.println(tmp);
        }

        sc.close();
    }
}

/*
Wszystkim typom pętli w Javie towarzyszą dwie dodatkowe instrukcje:

    break - powoduje przerwanie działanie aktualnej iteracji i wyjście z pętli,
    continue - powoduje przerwanie aktualnej iteracji i przejście do następnej iteracji.

class NumPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Pierwsza pętla: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Druga pętla " + i);
        }
    }
}
 */