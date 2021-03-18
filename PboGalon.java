package tugasGalon;

import java.util.Scanner;

public class PboGalon {
    public static void main(String[] args){
        int gallons;
        double liters;
        Scanner x = new Scanner(System.in);

        System.out.println("Masukkan 'galon' yang ingin dikonversi : ");
        gallons = x.nextInt();

        liters = gallons *3.785;
        System.out.println(gallons+ " Galon adalah "+liters+ " liter.");
    }
}
