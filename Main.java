import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        boolean result;

        System.out.println("x= "+ x + " y= " + y);

        System.out.println(result=x>y);
        System.out.println(result=x*2>y);
        System.out.println(result=y<x+3&&y>x-2);
        System.out.println(result=(x*y)%2==0);



    }
}




//    Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy. Podstawowe informacje o pracowniku jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy,
//            Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników, a następnie wyświetlisz informację o nich na ekranie.
