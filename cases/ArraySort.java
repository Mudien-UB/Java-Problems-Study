package cases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {

        // Pendekatan 1: Menggunakan Array Biasa
        // Pendekatan ini digunakan untuk array tipe data yang sudah didefinisikan,
        // seperti String[], Integer[], Double[], dll.
        // Contoh penggunaan Array Biasa
        String[] arrayString = { "banana", "apple", "orange", "kiwi" };
        Integer[] arrayInt = { 5, 3, 8, 1, 2 };
        Double[] arrayDouble = { 3.14, 1.59, 2.65, 5.89 };

        // Sorting menggunakan Arrays.sort() untuk array biasa
        Arrays.sort(arrayString);
        Arrays.sort(arrayInt);
        Arrays.sort(arrayDouble);

        // Menampilkan hasil sorting untuk array
        System.out.println("Sorted String Array (Array Biasa): " + Arrays.toString(arrayString));
        System.out.println("Sorted Integer Array (Array Biasa): " + Arrays.toString(arrayInt));
        System.out.println("Sorted Double Array (Array Biasa): " + Arrays.toString(arrayDouble));

        System.out.println("-".repeat(50));

        // Pendekatan 2: Menggunakan ArrayList
        // Pendekatan ini menggunakan ArrayList yang lebih fleksibel
        // dan dapat menampung berbagai tipe data.
        // Contoh penggunaan ArrayList
        ArrayList<String> arrayListString = new ArrayList<>(Arrays.asList(arrayString));
        ArrayList<Integer> arrayListInt = new ArrayList<>(Arrays.asList(arrayInt));
        ArrayList<Double> arrayListDouble = new ArrayList<>(Arrays.asList(arrayDouble));

        // Sorting menggunakan ArrayList
        // Collections.sort() untuk ArrayList
        // dan tampilkan hasilnya
        Collections.sort(arrayListString);
        Collections.sort(arrayListInt);
        Collections.sort(arrayListDouble);
        // Menampilkan hasil sorting untuk ArrayList
        System.out.println("Sorted String Array (ArrayList): " + arrayListString);
        System.out.println("Sorted Integer Array (ArrayList): " + arrayListInt);
        System.out.println("Sorted Double Array (ArrayList): " + arrayListDouble);
        System.out.println("-".repeat(50));
    }
}
