public class Oprator {
    public static void main(String[] args) {
        boolean Bool1, Bool2;
        int i, j;
        float x, y;

        System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");

        // Operasi boolean
        Bool1 = true;
        Bool2 = false;
        
        System.out.println("\nBoolean AND (true && false) : " + (Bool1 && Bool2));
        System.out.println("Boolean OR (true || false)  : " + (Bool1 || Bool2));
        System.out.println("Boolean NOT (!true)         : " + (!Bool1));
        System.out.println("Boolean XOR (true ^ false)  : " + (Bool1 ^ Bool2));

        // Operasi numerik
        System.out.println("\n-operasi numerik\n");
        i = 5;
        j = 2;
        
        System.out.println("Penjumlahan (5 + 2)  : " + (i + j));
        System.out.println("Pengurangan (5 - 2)  : " + (i - j));
        System.out.println("Perkalian (5 * 2)    : " + (i * j));
        System.out.println("Pembagian (5 / 2)    : " + ((float) i / j)); // Cast ke float agar hasilnya float
        System.out.println("Modulus (5 % 2)      : " + (i % j)); 

        // Operasi numerik dengan float
        System.out.println("\n-operasi numerik dengan float\n");
        x = 5.0f;
        y = 5.0f;
        
        System.out.println("Penjumlahan (5.0 + 5.0)  : " + (x + y));
        System.out.println("Pengurangan (5.0 - 5.0)  : " + (x - y));
        System.out.println("Perkalian (5.0 * 5.0)    : " + (x * y));
        System.out.println("Pembagian (5.0 / 5.0)    : " + (x / y));

        // Operasi relasional numerik
        System.out.println("\n-operasi relasional numerik\n");
        System.out.println("Apakah 5 == 2? " + (i == j));
        System.out.println("Apakah 5 != 2? " + (i != j));
        System.out.println("Apakah 5 < 2? " + (i < j));
        System.out.println("Apakah 5 > 2? " + (i > j));
        System.out.println("Apakah 5 <= 2? " + (i <= j));
        System.out.println("Apakah 5 >= 2? " + (i >= j));

        // Operasi relasional numerik dengan float
        System.out.println("\n-operasi relasional numerik dengan float\n");
        System.out.println("Apakah 5.0 != 5.0? " + (x != y));
        System.out.println("Apakah 5.0 < 5.0? " + (x < y));
        System.out.println("Apakah 5.0 > 5.0? " + (x > y));
        System.out.println("Apakah 5.0 <= 5.0? " + (x <= y));
        System.out.println("Apakah 5.0 >= 5.0? " + (x >= y));
    }
}
