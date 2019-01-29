package App;

import utlis.DataReader;
import Data.Pracownik;
import Data.HR_Firma;

import javax.xml.crypto.Data;

public class HRControl {

    // zmienne do kontrolowania programu
    public final int exit=0;
    public final int addPracownik =1;
    public final int showPracownicy=2;
    // zmienna do komunikacji z użytkownikiem

    private DataReader dataReader;

    // "biblioteka" przechowująca dane

    private HR_Firma hr_firma;

    public HRControl(){
        dataReader = new DataReader();
        hr_firma = new HR_Firma();
    }


    /*
     * Główna pętla programu, która pozwala na wybór opcji i interakcję
     */

    public void controlLoop(){
        int option;
        printOptions();
        while((option=dataReader.getInt())!=exit){
            switch (option){
                case addPracownik:
                    addPracownik();
                    break;
                case showPracownicy:
                    showPracownicy();
                    break;
                    default:
                        System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
            printOptions();
        }
        // zamykamy strumień wejścia
        dataReader.close();
    }

    private void printOptions(){
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowego pracownika");
        System.out.println("2 - wyświetl zatrudnionych pracowników");
    }

    private void addPracownik(){
        Pracownik pracownik = dataReader.readAndCreatePracownik();
        hr_firma.addPracownik(pracownik);
    }

    private void showPracownicy(){
        hr_firma.showPracownicy();
    }

}
