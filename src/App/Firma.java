package App;

import Data.Pracownik;
import utlis.DataReader;

import javax.xml.crypto.Data;

public class Firma {
    public static void main(String[] args) {
        final String appName = "Firma v0.7";
        System.out.println(appName);
        HRControl hrControl = new HRControl();
        hrControl.controlLoop();
    }
}
/*


class Library {
	public static void main(String[] args) {
		final String appName = "Biblioteka v0.3";

		Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg",
				"9788373271890");
		Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
				352, "Helion", "9788324620845");
		Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
				"Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media",
				"9780071591065");

		System.out.print(appName);
		System.out.println("Książki dostępne w bibliotece:");
		book1.printInfo();
		book2.printInfo();
		book3.printInfo();
	}
}






public class Firma {
    public static void main(String[] args) {
        Pracownik Dyrektor = new Pracownik();
        Dyrektor.Name = "Paweł Siwek";
        Dyrektor.Stanowisko = "Central Product Owner";
        Dyrektor.Dzial = "CACI";
        Dyrektor.Staz = 5;
        Dyrektor.Funkcja = "Zarzadzanie";

        Pracownik Kierownik = new Pracownik();
        Kierownik.Name = "Agata Walaszek";
        Kierownik.Stanowisko = "Product Owner";
        Kierownik.Dzial = "CACI";
        Kierownik.Staz = 3;
        Kierownik.Funkcja = "Zarzadzanie";

        Pracownik Nowy = new Pracownik();
        Nowy.Name = "Dietmar Skrzydło";
        Nowy.Stanowisko = "Analityl Aplikacji";
        Nowy.Dzial = "DAD";
        Nowy.Staz = 1;
        Nowy.Funkcja = "IT";

        String HRinfo = "W firmie pracują " + Dyrektor.Name + " " + Kierownik.Name
                + " " + Nowy.Name
                + ", na stanowiskach : " + Dyrektor.Stanowisko + ", " + Kierownik.Stanowisko + ", " + Nowy.Stanowisko
                + ", ich staze wynosza kolejno " + Dyrektor.Staz + ", " + Kierownik.Staz + ", " + Nowy.Staz
                + ", razem wspomagaja dział " + Dyrektor.Dzial;
        System.out.println("Poznaj nasz firme: ");
        System.out.println(HRinfo);
    }
}
 */