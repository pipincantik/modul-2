package modul2;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan data mahasiswa");
            System.out.println("2. Tampilkan data mahasiswa");
            System.out.println("3. Keluar/Exit");
            System.out.print("Pilihan User: ");
            pilih = input.nextInt();

            switch (pilih){
                case 1 :
                    mhs.tambahkanData();
                    break;
                case 2 :
                    mhs.tampilanDataMahasiswa();
                    break;
                case 3 :
                    break;
                default:
                    System.out.println("Maaf inputan anda salah");
                    break;
            }
        }while (pilih != 3);

    }
}

class Mahasiswa {
    String namaMahasiswa;
    String nim;
    String jurusan;

    void tambahkanData(){
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = inp.nextLine();

        System.out.print("Masukkan Nim mahasiswa: ");
        nim = inp.nextLine();

        int length = String.valueOf(nim).length();
        while(length != 15) {
            System.out.println("Nim harus 15 digit!!!");
            System.out.print("Masukkan Nim mahasiswa: ");
            nim = inp.nextLine();
        }
        System.out.print("Masukkan jurusan mahasiswa: ");
        jurusan = inp.nextLine();
        System.out.println("Data mahasiswa berhasil di tambahkan.");

    }
    void tampilUniversitas(){
        System.out.println("Universitas Muhammadiyah Malang");
    }
    void tampilanDataMahasiswa(){
        System.out.println("Data mahasiswa: ");
        tampilUniversitas();
        System.out.println("Nama: " + namaMahasiswa +", NIM: " + nim + ", Jurusan: " + jurusan);
    }
}