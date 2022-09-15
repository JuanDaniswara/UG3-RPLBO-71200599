package com.ug3.soal1;
import java.util.*;
public class UG3soal1
{
    public static void main( String[] args ) {
        Scanner Inputan= new Scanner(System.in);
        String nama, tanggalKadaluarsa ;
        float kuantity, berat ;

        System.out.println("====================Data Product====================");
        System.out.print("Nama Makanan: ");
        nama = Inputan.nextLine();
        System.out.print("Tanggal kadaluarsa: ");
        tanggalKadaluarsa = Inputan.nextLine();
        System.out.print("Jumlah (Quantity): ");
        kuantity = Inputan.nextFloat();
        System.out.print("Berat (Gram): ");
        berat = Inputan.nextFloat();

        System.out.println("====================Data Product====================");
        System.out.println("Output");
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Tanggal kadaluarsa: "+ tanggalKadaluarsa);
        System.out.println("Jumlah (Quantity): "+ kuantity);
        System.out.println("Berat: "+ berat +" gram");
        System.out.println("====================================================");
    }
}


