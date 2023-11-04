public class Soal4 {

    public static void main(String[] args) {

        // Deklarasi array
        int[] angka = new int[5];

        // Isi nilai array
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;

        // Tampilkan semua nilai array
        System.out.println("Nilai array:");
        for(int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

    }

}