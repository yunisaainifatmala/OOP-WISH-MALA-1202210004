package latihanarray;
import java.util.Arrays;
import java.util.Scanner;

public class LatihanArray {
     public static void main(String args[]){
        int[] myArray = new int[11];

        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Masukan angka: ");
            int angka = myScanner.nextInt();
            if (i > 0) {
                if (i % 2 == 0) {
                    myArray[i] = angka;
                } else {
                }
            }

        }
        System.out.println(Arrays.toString(myArray));
    }
}