package Data;

public class HR_Firma {
    public final int maxPracownik = 1000;
    private Pracownik[] Pracownicy;
    private int LiczbaPracownicy;

    public HR_Firma() {
        Pracownicy = new Pracownik[maxPracownik];
    }

    public int getLiczbaPracownicy() {
        return LiczbaPracownicy;
    }

    public Pracownik[] getPracownicy() {

        return Pracownicy;
    }

    public void addPracownik(Pracownik pracownik) {
        if (LiczbaPracownicy < maxPracownik) {
            Pracownicy[LiczbaPracownicy] = pracownik;
            LiczbaPracownicy++;
        } else {
            System.out.println("Maxymalna liczba etatów osiągnięta");
        }
    }

    public void showPracownicy(){
        if(LiczbaPracownicy==0){
            System.out.println("Brak zajętych etatów");
        }

        for(int i=0; i<LiczbaPracownicy; i++){
            Pracownicy[i].printInfo();
        }
    }
}
