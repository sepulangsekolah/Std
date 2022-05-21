package com.pbo;

import java.util.Scanner;

public class pegawai {
    String nama, tl, id;
    int golongan,
            g1 = 4000000,
            g2 = 5000000,
            g3 = 6000000,
            g4 = 7000000,
            nondokter = 1000000,
            totalgaji;

    public void data() {
        System.out.println("Masukkan Data Pegawai");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan ID : ");
        id = input.nextLine();
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Tanggal Lahir : ");
        tl = input.nextLine();
        System.out.print("Golongan : ");
        golongan = input.nextInt();
        System.out.println("");
        input.close();

        System.out.println("+------ Gaji Pokok ------+");
        System.out.println("Golongan 1 : Rp. 4.000.000");
        System.out.println("Golongan 2 : Rp. 5.000.000");
        System.out.println("Golongan 3 : Rp. 6.000.000");
        System.out.println("Golongan 4 : Rp. 7.000.000");
        System.out.println("+------------------------+");
        System.out.println("\n+-----------------------------------+");
        System.out.println("Anda adalah non dokter");
        System.out.println("Tunjangan pegawai : Rp. 1.000.000");
        System.out.println("+-----------------------------------+");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Tanggal Lahir: " + tl);
        System.out.println("");

        if (golongan == 1) {
            totalgaji = g1 + nondokter;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 2) {
            totalgaji = g2 + nondokter;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 3) {
            totalgaji = g3 + nondokter;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 4) {
            totalgaji = g4 + nondokter;
            System.out.println("Gaji Anda : " + totalgaji);
        } else {
            System.out.println("Golongan Salah");
        }
    }

    public static void main(String[] args) {

    }

}