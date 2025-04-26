package cases;
public class SumOfArray {
    

    private static int sumArray(int[] numbers) {

    /*
    *  Menggunakan loop for untuk menjumlahkan elemen array
    */
        // int sum = 0;
        //     for (int number : numbers) {
        //             sum += number;
        //         }
        // return sum;

    /*
    *    Pendekatan ini menggunakan loop for-each untuk menjumlahkan seluruh elemen array. 
    *    Kelebihannya adalah mudah dipahami dan tidak memerlukan API tambahan. 
    *    Pendekatan ini memiliki performa yang baik dan tidak memerlukan API tambahan, namun cenderung lebih panjang dan kurang fleksibel 
    *    untuk operasi yang lebih kompleks seperti filter atau transformasi data.
    *
    *    Menggunakan stream untuk menjumlahkan elemen array
    */
        return java.util.Arrays.stream(numbers).sum();
    
    /*
    *   Pendekatan ini memanfaatkan Java Stream API untuk menjumlahkan elemen array secara ringkas dan deklaratif. 
    *   Sangat efisien dari segi penulisan karena hanya memerlukan satu baris kode, serta lebih fleksibel jika ingin menambahkan operasi lain 
    *   seperti filter atau map. Namun, pendekatan ini bisa membingungkan bagi pemula yang belum familiar dengan konsep pemrograman fungsional 
    *   dan memiliki sedikit overhead dibanding loop biasa.
    *   Namun, untuk array kecil, perbedaan performa tidak signifikan.
    *   Jika Anda hanya perlu menjumlahkan elemen array tanpa operasi tambahan,
    *   pendekatan loop for-each mungkin lebih mudah dipahami.
    *   Namun, jika Anda bekerja dengan array besar atau ingin menambahkan operasi lain di masa depan,
    *   menggunakan Stream API bisa lebih efisien dan fleksibel.
    */
        

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.printf("This is the sum: %d" , sum);
    }

}
