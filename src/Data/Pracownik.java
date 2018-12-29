package Data;

public class Pracownik {
    private String Name;
    private String Stanowisko;
    private String Dzial;
    private int Staz;
    private String Funkcja;

    public Pracownik( String Name, String Stanowisko, String Dzial, int Staz, String Funkcja) {
        this.Name = Name;
        this.Stanowisko = Stanowisko;
        this.Dzial = Dzial;
        this.Staz = Staz;
        this.Funkcja = Funkcja;

    }

    public Pracownik( Pracownik Pracownik){
        this(Pracownik.Name, Pracownik.Stanowisko, Pracownik.Dzial,
                Pracownik.Staz, Pracownik.Funkcja);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStanowisko() {
        return Stanowisko;
    }

    public void setStanowisko(String Stanowisko) {
        this.Stanowisko = Stanowisko;
    }

    public String getDzial() {
        return Dzial;
    }

    public void setDzial(String Dzial) {
        this.Dzial = Dzial;
    }

    public int getStaz() {
        return Staz;
    }

    public void setStaz(int Staz) {
        this.Staz = Staz;
    }

    public String getFunkcja() {
        return Funkcja;
    }

    public void setFunkcja(String Funkcja) {
        this.Funkcja = Funkcja;
    }




    public void printInfo() {
        String info = getName() + "; " + getStanowisko() + "; " + getDzial() + "; " + getStaz() + "; " + getFunkcja();
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