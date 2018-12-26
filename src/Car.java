class Car {
    int year;
    String brand;
    String model;
    String color;

    // konstruktor1
    Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    // konstruktor2
    Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
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