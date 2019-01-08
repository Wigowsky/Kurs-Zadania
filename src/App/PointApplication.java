package App;
import Data.Point;
import Logic.PointController;

public class PointApplication {

    public static final int ADD_X = 1;
    public static final int ADD_Y = 0;
    public static final int MINUS_X = 1;
    public static final int MINUS_Y = 3;

    public static void main (String[] args)
    {
        Point p1 = new Point(10,20);
        PointController pc = new PointController();

        switch (ADD_X) {
            case 1:
                System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
                pc.addX(p1);
                System.out.println("Punkt addX: (" + p1.getX()+";"+p1.getY()+")");
                break;
            case 0:
                System.out.println("Brak zmian dla ADD_X");
                break;
            default:
                System.out.println("Podana błędna wartość");
        }

        switch (ADD_Y) {
            case 1:
                System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
                pc.addY(p1);
                System.out.println("Punkt addY: (" + p1.getX()+";"+p1.getY()+")");
                break;
            case 0:
                System.out.println("Brak zmian dla ADD_Y");
                break;
            default:
                System.out.println("Podana błędna wartość");

        }

        switch (MINUS_X) {
            case 1:
                System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
                pc.minusX(p1);
                System.out.println("Punkt minusX: (" + p1.getX()+";"+p1.getY()+")");
                break;
            case 0:
                System.out.println("Brak zmian dla MINUS_X");
                break;
            default:
                System.out.println("Podana błędna wartość");

        }


        switch (MINUS_Y) {
            case 1:
                System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
                pc.minusY(p1);
                System.out.println("Punkt minusY: (" + p1.getX()+";"+p1.getY()+")");
                break;
            case 0:
                System.out.println("Brak zmian dla MINUS_Y");
                break;
            default:
                System.out.println("Podana błędna wartość");
        }




    }
}


/*
ich rozwiązanie plus treść :

W zadaniu wykorzystaj projekt z poprzedniego zadania (Specyfikatory dostępu i JavaBeans). W klasie PointApplication dodaj proste sterowanie, które pozwoli na zmianę wartości współrzędnych punktu w zależności od wybranej opcji.

    Zdefiniuj 4 stałe pozwalające na wybór odpowiedniego zachowania ADD_X, ADD_Y, MINUS_X, MINUS_Y
    Wykorzystaj strukturę switch i w niej wywołaj odpowiednią metodę klasy PointController
    Wyświetl zmienione współrzędne punktu

Podpowiedź:

Stałymi nazywamy takie pola klasy, które oznaczone są jako public/private static final, w naszym przypadku np.:

public static final int ADD_X = 1;
1
2

Stałych można używać w konstrukcji switch tak samo jak zmiennych finalnych.

package app;

import controller.PointController;
import data.Point;

public class PointApplication {

	public static final int ADD_X = 0;
	public static final int ADD_Y = 1;
	public static final int MINUS_X = 2;
	public static final int MINUS_Y = 3;

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		PointController pc = new PointController();
		System.out.println("Punkt przed zmianą: (" + p1.getX()+";"+p1.getY()+")");

		int option = ADD_X;

		switch(option) {
		case ADD_X:
			pc.addX(p1);
			break;
		case ADD_Y:
			pc.addY(p1);
			break;
		case MINUS_X:
			pc.minusX(p1);
			break;
		case MINUS_Y:
			pc.minusY(p1);
			break;
		default:
			System.out.println("Podano błędną wartość");
		}

		System.out.println("Punkt po zmianie: (" + p1.getX()+";"+p1.getY()+")");
	}
}
 */