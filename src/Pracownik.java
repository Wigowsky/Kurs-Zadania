public class Pracownik {
    String Name;
    String Stanowisko;
    String Dzial;
    int Staz;
    String Funkcja;

    Pracownik( String Name, String Stanowisko, String Dzial, int Staz, String Funkcja) {
        this.Name = Name;
        this.Stanowisko = Stanowisko;
        this.Dzial = Dzial;
        this.Staz = Staz;
        this.Funkcja = Funkcja;

    }

    Pracownik( Pracownik Pracownik){
        this(Pracownik.Name, Pracownik.Stanowisko, Pracownik.Dzial,
                Pracownik.Staz, Pracownik.Funkcja);
    }

    void printInfo() {
        String info = Name + "; " + Stanowisko + "; " + Dzial + "; " + Staz + "; " + Funkcja;
        System.out.println(info);
    }

}



/*


class Book {
	String title;
	String author;
	int releaseDate;
	int pages;
	String publisher;
	String isbn;

	Book(String bookTitle, String bookAuthor, int bookRelease, int bookPages, String bookPublisher,
			String bookIsbn) {
		title = bookTitle;
		author = bookAuthor;
		releaseDate = bookRelease;
		pages = bookPages;
		publisher = bookPublisher;
		isbn = bookIsbn;
	}

	void printInfo() {
		String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher
				+ "; " + isbn;
		System.out.println(info);
	}

}
 */