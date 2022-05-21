package com.pbo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        dokter dktr = new dokter();
        pegawai nondokter = new pegawai();
        Scanner input = new Scanner(System.in);
        System.out.println("+------ Jenis Pegawai ------+");
        System.out.println("1.Dokter");
        System.out.println("2.Non Dokter");
        System.out.println("+---------------------------+");

        String pilih = input.nextLine();
        switch (pilih) {
            case "1":
                dktr.data();
                break;
            case "2":
                nondokter.data();
                break;
            default:
                System.out.println("Pilihan anda tidak valid");
        }
        input.close();
    }

}