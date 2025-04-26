package cases;
/**
 * Kelas CountWords digunakan untuk menghitung jumlah kata dalam sebuah teks.
 */
public class CountWords {

    
    private static Integer count(String text) {

        // Memeriksa apakah teks kosong atau null
        // Jika ya, kembalikan 0
        if (text == null || text.isEmpty()) {
            return 0;
        }

        // Menggunakan regex "\\s+" untuk memisahkan kata berdasarkan satu atau lebih spasi
        // Kemudian mengembalikan panjang array hasil split sebagai jumlah kata
        return text.split("\\s+").length;
    }

    public static void main(String[] args) {

        String text = "This is a test string";
        Integer wordCount = count(text);

        System.out.printf("Word count: %d\n", wordCount);
    }
}
