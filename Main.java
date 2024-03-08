package Tugas2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarmhsw = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean next = true;
        while (next) {
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = input.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
            daftarmhsw.add(mahasiswa);

            System.out.print("Tambah lagi? ");
            String tambah = input.nextLine();
            next = tambah.equalsIgnoreCase("y");
        }

            input.close();

        System.out.println("==================================");
        for (Mahasiswa mahasiswa : daftarmhsw) {
            System.out.println(mahasiswa);
        }
    }
}
