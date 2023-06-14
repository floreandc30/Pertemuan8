package com.Florean_Desvita_Cindirahayu.pbo.POLIMORFISME_21102132;

public class StudentStaff_2132 {
        protected String nim, nama;
        protected int gajiPokok;

        public StudentStaff_2132(String nim, String nama, int gajiPokok){
            this.nim = nim;
            this.nama = nama;
            this.gajiPokok = gajiPokok;
        }

        public void tampilDataMahasiswa(){
            System.out.println(" ");
            System.out.println("NIK               :" + nim);
            System.out.println("Nama              :" + nama);
            System.out.println("Gaji Pokok        :" + gajiPokok);
    }
}
