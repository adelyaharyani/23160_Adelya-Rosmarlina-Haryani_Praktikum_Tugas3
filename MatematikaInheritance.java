// Class MatematikaInheritance untuk memanggil semua method
public class MatematikaInheritance {
    public static void main(String[] args) {
        // Membuat objek dari class Matematika2 (karena Matematika2 mewarisi Matematika)
        Matematika2 mtk = new Matematika2();

        // Memanggil method pertambahan dari class Matematika
        int hasilTambah = mtk.pertambahan(20, 10);
        System.out.println("Pertambahan: 20 + 10 = " + hasilTambah);

        // Memanggil method pengurangan dari class Matematika
        int hasilKurang = mtk.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilKurang);

        // Memanggil method perkalian dari class Matematika
        int hasilKali = mtk.perkalian(10, 3);
        System.out.println("Perkalian: 10 * 3 = " + hasilKali);

        // Memanggil method pembagian dari class Matematika
        int hasilBagi = mtk.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilBagi);

        // Memanggil method modulus dari class Matematika2
        int hasilModulus = mtk.modulus(21, 4);
        System.out.println("Modulus: 21 % 4 = " + hasilModulus);
    }
}
