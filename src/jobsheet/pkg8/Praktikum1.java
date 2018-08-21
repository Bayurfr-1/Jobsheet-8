/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg8;

import java.util.Scanner;

/**
 *
 * @author win 7
 */
public class Praktikum1 {
    public static void main(String[] args) {
        
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner (System.in);
        
        while( running ) {
            System.out.println("Apakah anda ingin keluar ??");
            System.out.print("Jawab[ Ya / Tidak ] > ");
            
            jawab = scan.nextLine();
            
            if(jawab.equalsIgnoreCase("Yas") ){
                running = false;
            }
            counter++;
        }
        System.out.println("anda sudah melakukan perulangan sebanyak" + counter + "kali");
    }
}
            
        
    

