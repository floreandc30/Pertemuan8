package com.Florean_Desvita_Cindirahayu.pbo.POLIMORFISME_21102132;

public class StaffLab_2132 extends StudentStaff_2132 {
        private String namaLab;
        private int jamKerja;

        public StaffLab_2132(String nim, String nama, int gajiPokok, String namaLab, int jamKerja ){
            super(nim, nama, gajiPokok);
            this.namaLab = namaLab;
            this.jamKerja = jamKerja;
        }

        public double totalGaji(){
            return gajiPokok + (jamKerja * 30000);
        }
        public void tampilDatamhs(){
            System.out.println("Nama Lab          :" + namaLab);
            System.out.println("Jam Kerja         :" + jamKerja);
            System.out.println("=============================");
            System.out.println("Total Pendapatan  :" + totalGaji());
        }
    }

