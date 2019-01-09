public class TabliceZadanie {

    public static  void main (String[] args){

        int [] Tablica1 = new int [3];
        int [] Tablica2 = new int [3];

        Tablica1[0]=1;
        Tablica1[1]=2;
        Tablica1[2]=3;

        Tablica2[0]=6;
        Tablica2[1]=5;
        Tablica2[2]=4;


        System.out.println(Tablica1[0]+Tablica1[1]+Tablica1[2]+Tablica2[0]+Tablica2[1]+Tablica2[2]);

    }

}


/* Ich rozwiązanie
public class NumbersSum {
	public static void main(String[] args) {
		int[] tab1 = {6, 9, 12};
		int[] tab2 = {5, 10, 15};

		System.out.println("Suma liczb wynosi: ");
		int sum = tab1[0]+tab1[1]+tab1[2] + tab2[0]+tab2[1]+tab2[2];
		System.out.println(sum);
	}
}
 */