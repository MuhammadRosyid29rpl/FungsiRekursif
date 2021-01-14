/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsirekursif;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class FungsiRekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int bil,hasil;//tipedatainteger
        System.out.print("Masukkan suatu bilangan : ");
        bil=input.nextInt();
        hasil = faktorial (bil);
        System.out.println("Nilai faktorial " +bil+ " adalah "+hasil);
    }
    private static int faktorial(int a){//method untuk menentukan faktorial bilangan
        if (a==1);
        return 1;
    }else {
        return (a*faktorial(a-1));
    }
    
}

