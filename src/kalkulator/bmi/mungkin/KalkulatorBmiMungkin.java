/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator.bmi.mungkin;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KalkulatorBmiMungkin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float bb,tb,bmi,m;
        System.out.println("---------------Kalkulator BMI-----------------");
        System.out.print("Silahkan masukkan berat badan anda (kg): ");
        bb = in.nextFloat();
        System.out.print("Silahkan masukkan tinggi badan anda (cm): ");
        tb = in.nextFloat();
        System.out.println();
        m = tb/100;
        bmi = bb/(m*m);
        System.out.println("BMI anda adalah: "+bmi);
        if(bmi<18.5){
            System.out.println("Anda kekurangan berat badan (kurang dari 18.5)");
        }else if(bmi<=24.9){
            System.out.println("Berat badan anda normal/ideal (18.5-24.9)");
        }else if(bmi<24.9){
            System.out.println("Anda kelebihan berat badan (25-29.9)");
        }else{
            System.out.println("Anda kegemukan/obesitas (lebih dari 30)");
        }
        System.out.println("----------------------------------------------");
    }
}
