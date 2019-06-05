public class Company {
    public static void main (String[] args){
        Employee szef = new Employee();
        szef.imie="Marcin";
        szef.nazwisko="Popo";
        szef.rokurodzenia=1998;
        szef.stanowisko="szef";
        szef.staz=15;

        System.out.println("Pracownik nazywa sie " + szef.imie + " " + szef.nazwisko + " i to jego dane " + szef.rokurodzenia + " " + szef.stanowisko + " " + szef.staz);


        Employee senior = new Employee();
        senior.imie="Dawid";
        senior.nazwisko="Bakosz";
        senior.rokurodzenia=1993;
        senior.stanowisko="senior";
        senior.staz=10;

        System.out.println("Pracownik nazywa sie " + senior.imie + " " + senior.nazwisko + " i to jego dane " + senior.rokurodzenia + " " + senior.stanowisko + " " + senior.staz);


        Employee junior = new Employee();
        junior.imie="Ala";
        junior.nazwisko="Lizacz";
        junior.rokurodzenia=2002;
        junior.stanowisko="junior";
        junior.staz=1;

        System.out.println("Pracownik nazywa sie " + junior.imie + " " + junior.nazwisko + " i to jego dane " + junior.rokurodzenia + " " + junior.stanowisko + " " + junior.staz);

    }
}
