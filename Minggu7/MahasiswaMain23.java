package Minggu7;
import java.util.Scanner;

public class MahasiswaMain23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs23 data = new PencarianMhs23();
        int jumMhs = 5;

        System.out.println("------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa23 m = new Mahasiswa23(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cariNama = sl.nextLine(); 
        System.out.println("menggunakan binary Search");

        data.urutkanData(); 
        int posisi = data.findBinarySearch(cariNama, 0, jumMhs - 1);

        data.tampilData(cariNama);

        System.out.println("-----------------------");
    }
}