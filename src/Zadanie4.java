import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10); // losowa liczba z przedziału [0, 9], 10 się nie wlicza
        int y = new Random().nextInt(10); // krótsza wersja
        System.out.println(x);
        System.out.println(y);

        System.out.println(x>y);
        System.out.println(x*2>y);
        System.out.println(y<x+3 && y>x-2);
        System.out.println((x*y)%2==0);

    }
}
