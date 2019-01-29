import java.util.Scanner;

class While {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        final int number = 500;
        int userInput;
        System.out.println("Zgadnij liczbę");

        while ((userInput = reader.nextInt()) != number) {
            if (userInput > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            } else {
                System.out.println("Podana liczba jest za mała, zgaduj dalej!");
            }
        }

        System.out.println("Brawo, zgadłeś o jaką liczbę chodziło, wygrywasz złote kalesony");

        reader.close();
    }
}

/*
Tak jak zwykle utworzyliśmy obiekt Scanner do odczytu danych. Kolejne zmienne to:

    number - liczba, którą użytkownik ma zgadnąć,
    userInput - tymczasowa zmienna, która pozwoli przechowywać informację o liczbie wprowadzanej przez użytkownika.

W pętli while mamy zwartą jednolinijkową konstrukcję, którą można podzielić na dwie części:

    userInput = reader.nextInt() - wczytanie liczby od użytkownika
    (userInput = reader.nextInt()) != number - tutaj następuje porównanie zmiennej userInput z number. Jeśli liczby są różne, to wynikiem porównania będzie true,
     a jeśli liczby będą równe wynikiem będzie false i tym samym wyjdziemy z pętli

Teraz następuje istota samej pętli while. Dopóki wprowadzane liczby będą różne od podanego przez nas 500,
dopóty warunek pętli będzie prawdziwy (true) i pętla będzie powtarzała swoje działanie.
Jeśli użytkownik zgadnie więc liczbę w pierwszym podejściu, instrukcje wewnątrz pętli while nie wykonają się ani razu i od razu zostanie wyświetlony komunikat z gratulacjami.
W pętli while często stosuje się taką odwrotną logikę, czyli "powtarzaj pętlę dopóki liczba jest błędna" zamiast "powtarzaj pętlę dopóki liczba jest prawidłowa".
 */