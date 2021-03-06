package Data;

public class Car {

    private int year;
    private String brand;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        //ustawiamy nową wartość year jeżeli jest ona większa od 0
        if(year > 0) {
            this.year = year;
        } else { //jeśli ktoś przekaże liczbę mniejszą lub równą zero, wyświetlamy komunikat
            System.out.println("Rok musi być większy od 0!");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int year, String brand, String model, String color) {
        this.setYear(year);
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);
    }
}



/* Bez użycia "this"

class Car {
    int year;
    String brand;
    String model;
    String color;

    Car(int y, String b, String m, String c) {
        year = y;
        brand = b;
        model = m;
        color = c;
    }

    Car(int y, String b, String m) {
        year = y;
        brand = b;
        model = m;
    }
}
 */