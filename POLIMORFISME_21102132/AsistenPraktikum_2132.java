package com.Florean_Desvita_Cindirahayu.pbo.POLIMORFISME_21102132;

public class AsistenPraktikum_2132 extends StudentStaff_2132  {

        private String mataKuliah;
        private int jmlPertemuan;

        public AsistenPraktikum_2132(String nim, String nama, int gajiPokok, String mataKuliah, int jmlPertemuan ){
            super(nim, nama, gajiPokok);
            this.mataKuliah = mataKuliah;
            this.jmlPertemuan = jmlPertemuan;
        }
        public double totalGaji(){
            return gajiPokok + (jmlPertemuan * 20000);
        }
        public void tampilDatamhs() {
            System.out.println("Mata Kuliah       :" + mataKuliah);
            System.out.println("Jumlah Pertemuan  :" + jmlPertemuan);
            System.out.println("=============================");
            System.out.println("Total Pendapatan  :" + totalGaji());
        }
    }
