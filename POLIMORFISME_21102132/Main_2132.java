package com.Florean_Desvita_Cindirahayu.pbo.POLIMORFISME_21102132;

import java.util.ArrayList;
import java.util.Scanner;
public class Main_2132 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<AsistenPraktikum_2132> asistenPraktikumList = new ArrayList<>();
        ArrayList<StaffLab_2132> studentStaffList = new ArrayList<>();

        // Input data Asisten Praktikum
        System.out.print("Masukkan jumlah Asisten Praktikum: ");
        int jumlahAsisten = input.nextInt();
        input.nextLine(); // Membuang karakter new line

        for (int i = 0; i < jumlahAsisten; i++) {
            System.out.println("Asisten Praktikum ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Gaji Pokok: ");
            int gajiPokok = input.nextInt();
            input.nextLine(); // Membuang karakter new line
            System.out.print("Mata Kuliah Asistensi: ");
            String mataKuliah = input.nextLine();
            System.out.print("Jumlah Pertemuan: ");
            int jmlPertemuan = input.nextInt();
            input.nextLine(); // Membuang karakter new line

            AsistenPraktikum_2132 asistenPraktikum = new AsistenPraktikum_2132(nim, nama, gajiPokok, mataKuliah, jmlPertemuan);
            asistenPraktikumList.add(asistenPraktikum);
        }

        // Input data Student Staff
        System.out.print("-------------------------------\n");
        System.out.print("Masukkan jumlah Student Staff: ");
        int jumlahStaffLab_2132 = input.nextInt();
        input.nextLine(); // Membuang karakter new line
        for (int i = 0; i < jumlahStaffLab_2132; i++) {
            System.out.println("Student Staff ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Gaji Pokok : ");
            int gajiPokok = input.nextInt();
            input.nextLine(); // Membuang karakter new line
            System.out.print("Nama Lab: ");
            String unitKerja = input.nextLine();
            System.out.print("Jam Kerja: ");
            int jamKerja = input.nextInt();
            input.nextLine(); // Membuang karakter new line

            StaffLab_2132 stafflab = new StaffLab_2132(nim, nama, gajiPokok, unitKerja, jamKerja);
            studentStaffList.add(stafflab);
        }

        // Menampilkan data Asisten Praktikum
        System.out.println("\n=== Data Asisten Praktikum ===");
        for (AsistenPraktikum_2132 asistenPraktikum : asistenPraktikumList) {
            asistenPraktikum.tampilDataMahasiswa();
            asistenPraktikum.tampilDatamhs();
            System.out.println();
        }

        // Menampilkan data Student Staff
        System.out.println("\n=== Data Student Staff ===");
        for (StaffLab_2132 studentStaff : studentStaffList) {
            studentStaff.tampilDataMahasiswa();
            studentStaff.tampilDatamhs();
            System.out.println();
        }
    }
}



