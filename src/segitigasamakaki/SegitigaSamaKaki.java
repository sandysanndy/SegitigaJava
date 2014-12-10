/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitigasamakaki;

/**
 *
 * @author I'am a Muslim
 */
import java.util.Scanner;
public class SegitigaSamaKaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter baris = ");
        n = in.nextInt();
        long startTime = System.nanoTime();
        for(int i=1; i<=n; i++) {
            for( j=n; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        long stopTime = System.nanoTime();
    	double elapsedTime = (double) (stopTime - startTime)/1000000;
    	
        System.out.println();
        System.out.println("Waktu eksekusi = "+elapsedTime + " * 10^-3 detik");
    }
}
