package cases;
public class ReverseString {

    private static String reverse(String originalText) {
    /**
     * Metode untuk membalikkan urutan karakter dalam string.
     * 
     * Pendekatan pendekatan untuk membalikkan string :
     * 
     * 1. **Menggunakan loop `for` dan penggabungan karakter:**
     * 
     *    String reversed = "";
     *    for (int i = 0; i < originalText.length(); i++) {
     *        reversed = originalText.charAt(i) + reversed;
     *    }
     *    return reversed;
     * 
     *    ➤ Pendekatan ini mudah dipahami, tetapi sangat tidak efisien untuk string yang panjang,
     *      karena setiap penggabungan membuat objek baru.
     *    
     * 2. **Menggunakan StringBuilder:**
     */
        return new StringBuilder(originalText).reverse().toString();

    /**
     *   ➤ Pendekatan ini lebih efisien karena `StringBuilder` memungkinkan modifikasi string
     *      tanpa membuat objek baru setiap kali.
     * 
     * 3. **Menggunakan rekursi:**
     * 
     *    if (originalText.isEmpty()) {
     *        return originalText;
     *    } else {
     *        return reverse(originalText.substring(1)) + originalText.charAt(0);
     *    }
     * 
     *    ➤ Pendekatan ini lebih rumit dan tidak efisien untuk string yang panjang,
     *      tetapi menunjukkan kekuatan rekursi.
     */
    }

    public static void main(String[] args) {

        String originalText = "Hello World";
        String reversedText = reverse(originalText);

        System.out.printf("Original: %s\nReversed: %s\n", originalText, reversedText);
    }
}
