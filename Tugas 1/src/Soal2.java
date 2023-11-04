public class Soal2 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int i = 1;

        // Perulangan while
        while (i <= 10) {
            // Output
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }

            // Increment
            i++;
        }
    }
}
