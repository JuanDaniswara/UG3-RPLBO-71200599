package com.ug3.soal2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String inputPertama;
        String inputKedua;
        String inputProgram;
        int kali = 11;

        System.out.println("Bilangan Fibonacci dari kata");
        Scanner Inputan = new Scanner(System.in);
        System.out.print("Masukkan input pertama: ");
        inputPertama = Inputan.nextLine();
        int jumlahInputPertama = inputPertama.length();
        int panjangInputPertama = jumlahInputPertama;
        System.out.print("Masukkan input kedua: ");
        inputKedua = Inputan.nextLine();
        int jumlahInputKedua = inputKedua.length();
        int panjangInputKedua = jumlahInputKedua;

        System.out.print(jumlahInputPertama+" "+jumlahInputKedua);
        int i = 1;
        while (i < kali-1)
        {
            int sum = panjangInputPertama + panjangInputKedua;
            panjangInputPertama = panjangInputKedua;
            panjangInputKedua = sum;
            ;
            System.out.print(" "+ sum);
            i++;
        }
        System.out.println("");
        System.out.print("Keluar dari program (ketikan exit) : ");
        inputProgram = Inputan.nextLine().toLowerCase();

        if (inputProgram == "exit"){
            System.exit(0);
        }

    }
}
