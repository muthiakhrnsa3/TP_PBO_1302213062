/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod3_1302213062_se4502;

import java.util.Scanner;

/**
 *
 * @author Alvian Supriadi
 */
    
    class Lingkaran {
        String warna;
        double jariJari;
        
        void input_1302213062() {
            Scanner inpt = new Scanner(System.in);
            System.out.print("Masukkan warna lingkaran: ");
            warna = inpt.nextLine();
            System.out.print("Masukkan jari-jari lingkaran: ");
            jariJari = inpt.nextDouble();
        }
        
        void printWarna_1302213062(){
            System.out.println("Warna objek lingkaran adalah " + warna);
        }
        
        void printKeliling_1302213062(){
            System.out.println("Keliling objek lingkaran adalah " + 2 + jariJari * 22/7);
        }
        
         void printLuas_1302213062(){
            System.out.println("Luas objek lingkaran adalah " + jariJari * jariJari * 22/7);
        }
    }
}

public class TP_MOD3_1302213062_SE4502 {
    public static void main(String[] args) {
        Lingkaran Circle = new Lingkaran();
        
        Circle.input_1302213062();
        
        Circle.printWarna_1302213062();
        Circle.printKeliling_1302213062();
        Circle.printLuas_1302213062();
    }
}
