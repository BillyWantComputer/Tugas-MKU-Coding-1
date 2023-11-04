# Tugas-MKU-Coding-1
### Pembahasan Soal 1
Berikut ini merupakan penjelasan mengenai kode-kode tersebut 

public class Soal1 {
    public static void main(String[] args) {

        for(int i=1; i <= 100; i++) {

            System.out.println(i);
        }
        String nama = "Bill Gram Melkisedek";
        String npm = "G1A023063";
        String kelas = "Informatika A";
        System.out.println("Nama Mahasiswa : " + nama + ",\n" + "NPM : " + npm + ",\n" + "Program Studi dan Kelas : " + kelas);


    }
}

Baris 4-8 pada kode tersebut terdapat perulangan for yang digunakan untuk mencetak angka 1 sampai 100. Variabel i sebagai counter, diawali dengan nilai 1, kemudian dilakukan perulangan selama i kurang dari sama dengan 100, dan i ditambah 1 setiap kali perulangan. Di dalam perulangan, dilakukan pencetakan nilai i ke layar menggunakan System.out.println(i).

Baris 10-13 dideklarasikan 3 buah variabel bertipe String, yaitu nama, npm, dan kelas. Variabel tersebut diisi dengan nilai sesuai keterangan masing-masing.

Baris 14 dilakukan pencetakan ke layar yang berisi gabungan string dan nilai dari variabel-variabel yang telah dideklarasikan sebelumnya. \n digunakan untuk ganti baris (breaks).

Jadi secara keseluruhan program ini akan mencetak angka 1-100, kemudian mencetak keterangan mahasiswa yang berisi nama, NPM, dan kelas ke layar.


### Pembahasan Soal 2
Berikut ini merupakan penjelasan program tersebut.

public class Soal2 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}

Baris 5 merupakan deklarasi variabel i dengan tipe data integer dan assign nilai awal 1.
Baris 7 - 12 adalah blok kode perulangan while. Perulangan akan terus dilakukan selama kondisi i <= 10 bernilai true.
Di dalam perulangan, dilakukan pengecekan kondisi dengan operator modulus % yaitu sebagai berikut :
1. Jika sisa bagi i dengan 2 adalah 0, berarti i adalah bilangan genap
2. Jika tidak, berarti i adalah bilangan ganjil

Hasil pengecekan dicetak ke layar dengan String yang sesuai, dan menambahkan nilai i agar outputnya menjadi "1 adalah bilangan ganjil" dan seterusnya. Setelah cetak hasilnya, nilai i ditambah 1 (i++) agar perulangan bisa berlanjut. Perulangan akan terus berjalan sampai i > 10, di mana kondisi while bernilai false dan perulangan berhenti.

Jadi program ini akan mencetak angka 1 sampai 10 dan menuliskan apakah ganjil atau genap secara berurutan.


### Pembahasan Soal 3

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String dob = input.nextLine();

        String[] date = dob.split("/");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);

        String zodiac = "";

        if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
            zodiac = "Capricorn";
        } else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 17)) {
            zodiac = "Aquarius";
        } else if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19)) {
            zodiac = "Pisces";
        } else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
            zodiac = "Aries";
        } else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
            zodiac = "Taurus";
        } else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            zodiac = "Gemini";
        } else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            zodiac = "Cancer";
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
            zodiac = "Leo";
        } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
            zodiac = "Virgo";
        } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
            zodiac = "Libra";
        } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
            zodiac = "Scorpio";
        } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
            zodiac = "Sagittarius";
        }

        System.out.println("Your zodiac sign is: " + zodiac);

    }
}

Berikut ini adalah penjelasan singkat dari kode-kode dalam program.
1. Import library Scanner digunakan untuk mendapatkan input dari user.
2. Pembuatan instance scanner untuk baca input.
3. Menampilkan prompt untuk user memasukkan tanggal lahir (DD/MM/YYYY).
4. Membaca input tanggal lahir dan simpan ke variabel dob.
5. Split dob berdasarkan '/' menjadi array yang berisi DD, MM, YYYY.
6. Parse bagian DD dan MM ke integer untuk bisa dilakukan pengecekan.
7. Mendeklarasikan variabel zodiac untuk menampung hasil.
8. Menggunakan beberapa percabangan if/else if untuk mengecek rentang tanggal lahir dan menentukan zodiaknya.
9. Menampilkan zodiak yang sudah ditentukan ke user.

Jadi program ini akan meminta user input tanggal lahir, menentukan zodiak berdasarkan tanggal lahir, dan menampilkan zodiak yang sesuai ke user dengan memanfaatkan library Scanner, split string, parsing, dan percabangan if/else if.


### Pembahasan Soal 4

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

Berikut adalah penjelasan dari kode program Java diatas:

Baris 5 : Deklarasi array bertipe integer dengan nama "angka" dan panjang 5.

Baris 7-11 : Memberikan nilai pada masing-masing elemen array angka.

Baris 13 : Cetak string "Nilai array:" sebagai label.

Baris 14 : Perulangan for untuk mengakses seluruh elemen array angka. Variabel i sebagai counter, dimulai dari 0 hingga panjang array - 1.

Baris 15 : Mencetak nilai dari tiap elemen array angka dengan mengakses angka[i].

Jadi, program ini akan mendeklarasi array bertipe integer dengan panjang 5, mengisi masing-masing elemen array dengan nilai, dan menggunakan perulangan for untuk mengakses dan mencetak seluruh isi array
