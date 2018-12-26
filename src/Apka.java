public class Apka {
    public static void main (String[] args){
        final String AppName="Pierwsza Apka v2";

        Wersja Wersja_01 = new Wersja();
        Wersja_01.Title = "Wersja 0.1";
        Wersja_01.Author = "Mateusz Skrzydło";
        Wersja_01.releaseDate = 03.12;
        Wersja_01.version = 1;
        Wersja_01.tool = "Inteliij IDEA";
        Wersja_01.kodWersji = "0.1";

        System.out.println(AppName);
        System.out.println("Wersje mojej aplikacji");
        System.out.println(Wersja_01.Title);
        System.out.println(Wersja_01.Author);
        System.out.println(Wersja_01.releaseDate);
        System.out.println(Wersja_01.version);
        System.out.println(Wersja_01.tool);
        System.out.println(Wersja_01.kodWersji);

    }
}
