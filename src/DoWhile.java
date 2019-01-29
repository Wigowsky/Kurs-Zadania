public class DoWhile {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println("Liczba "+i);
        } while(i < 3);
    }
}


/*
ak już sama nazwa sugeruje pętla do while jest bardzo podobna do tradycyjnej while. Jedyną, ale bardzo ważną różnicą jest to, że pętla do while zawsze wykona przynajmniej jeden raz,
ponieważ najpierw wykonywany jest kod zawarty w pętli, a dopiero później sprawdzany jest warunek.
Pomimo tego, że warunek pętli jest błędny (zmienna i została zainicjowana wartością 5, więc nie jest mniejsza od 3) to na ekranie i tak pojawia się napis "Liczba 5".
 */