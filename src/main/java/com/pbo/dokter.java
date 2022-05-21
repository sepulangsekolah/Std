package com.pbo;

import java.util.Scanner;

public class dokter {
    String nama, tl, id, NID;
    int golongan,
            g1 = 4000000,
            g2 = 5000000,
            g3 = 6000000,
            g4 = 7000000,
            dokter = 3500000,
            mk4 = 1500000,
            mk6 = 3000000,
            mk10 = 5000000,
            mk, totalgaji;

    public void data() {
        System.out.println("\nSilahkan isi data anda");
        Scanner input = new Scanner(System.in);
        System.out.print("ID : ");
        id = input.nextLine();
        System.out.print("NID : ");
        NID = input.nextLine();
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Tanggal Lahir : ");
        tl = input.nextLine();
        System.out.print("Golongan (1-4) : ");
        golongan = input.nextInt();
        System.out.print("Masa Kerja (Tahun) : ");
        mk = input.nextInt();
        System.out.println("");
        input.close();

        System.out.println("+-------- Gaji Pokok -------+");
        System.out.println("Golongan 1 : Rp. 4.000.000");
        System.out.println("Golongan 2 : Rp. 5.000.000");
        System.out.println("Golongan 3 : Rp. 6.000.000");
        System.out.println("Golongan 4 : Rp. 7.000.000");
        System.out.println("+---------------------------+");
        System.out.println("\nAnda adalah dokter");
        System.out.println("Tunjangan pegawai : Rp. 3.500.000");
        System.out.println("");
        System.out.println("+------------ Tunjangan fungsional ------------+");
        System.out.println(" Masa kerja kurang dari 5 tahun : Rp. 1.500.000");
        System.out.println(" Masa kerja 5 tahun - 10 tahun : Rp. 3.000.000");
        System.out.println(" Masa kerja lebih dari 10 tahun : Rp. 5.000.000");
        System.out.println("+---------------------------------------------+");
        System.out.println("ID: " + id);
        System.out.println("NID: " + NID);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir : " + tl);
        System.out.println("Golongan : " + golongan);
        System.out.println("Masa Kerja : " + mk + " Tahun");
        System.out.println("");

        if (golongan == 1 && mk <= 5) {
            totalgaji = g1 + dokter + mk4;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 1 && mk >= 5 && mk <= 10) {
            totalgaji = g1 + dokter + mk6;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 1 && mk >= 10) {
            totalgaji = g1 + dokter + mk10;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 2 && mk <= 5) {
            totalgaji = g2 + dokter + mk4;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 2 && mk >= 5 && mk <= 10) {
            totalgaji = g2 + dokter + mk6;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 2 && mk >= 10) {
            totalgaji = g2 + dokter + mk10;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 3 && mk <= 5) {
            totalgaji = g3 + dokter + mk4;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 3 && mk >= 5 && mk <= 10) {
            totalgaji = g3 + dokter + mk6;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 3 && mk >= 10) {
            totalgaji = g3 + dokter + mk10;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 4 && mk <= 5) {
            totalgaji = g4 + dokter + mk4;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 4 && mk >= 5 && mk <= 10) {
            totalgaji = g4 + dokter + mk6;
            System.out.println("Gaji Anda : " + totalgaji);
        } else if (golongan == 4 && mk >= 10) {
            totalgaji = g4 + dokter + mk10;
            System.out.println("Gaji Anda : " + totalgaji);
        } else {
            System.out.println("Golongan Salah");
        }
    }

    public static void main(String[] args) {

    }

}