package utlis;

import java.util.Scanner;
import Data.Pracownik;

public class DataReader {
    private Scanner sc;

    public DataReader(){
        sc=new Scanner(System.in);
    }

    public void close(){
        sc.close();
    }

    public Pracownik readAndCreatePracownik(){

        System.out.println("Name: ");
        String Name = sc.nextLine();
        System.out.println("Stanowisko: ");
        String Stanowisko = sc.nextLine();
        System.out.println("Dzial: ");
        String Dzial = sc.nextLine();
        System.out.println("Staz: ");
        int Staz = sc.nextInt();
        sc.nextLine();
        System.out.println("Funkcja: ");
        String Funkcja = sc.nextLine();
        sc.nextLine();

        return new Pracownik(Name, Stanowisko, Dzial, Staz, Funkcja);

    }
}
