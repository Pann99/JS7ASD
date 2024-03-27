package Minggu7;

public class Mahasiswa23 {
        int nim;
        String nama;
        int umur;
        double ipk;
    
        // Konstruktor
        Mahasiswa23(int ni, String n, int u, double i) {
            nim = ni;
            nama = n;
            umur = u;
            ipk = i;
        }

        void tampil() {
            System.out.println("Nim = " + nim);
            System.out.println("Nama = " + nama);
            System.out.println("Umur = " + umur);
            System.out.println("IPK = " + ipk);
        }
    
        public static void sequentialSearch(int[] arr, int key) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("Nilai " + key + " ditemukan pada indeks " + i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
            }
        }
    
        public static void main(String[] args) {
            Mahasiswa23 mhs = new Mahasiswa23(123456, "John Doe", 20, 3.75);
            mhs.tampil();
    
        }
    }
