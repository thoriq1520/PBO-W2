/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berhitung;

import java.util.Scanner;
/**
 *
 * @author Thor
 */
public class Berhitung {

     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner inputan = new Scanner(System.in);
            int x, y, jawaban = 0;
            String operasi;
     
    System.out.println("Mari Berhitung");
     System.out.println("Angka tidak bisa kurang dari 1 dan tidak boleh lebih dari 1000\n");
    x = inputan.nextInt();
    operasi = inputan.next();
    y = inputan.nextInt();
    
    if (x >= 1 && x <= 1000 && y >= 1 && y <= 1000) {
        switch(operasi){
                case "*" : jawaban = x*y;
                        break; // perkalian
             	case "/" : jawaban = x/y;
                        break; // pembagian
             	case "+" : jawaban = x+y;
                        break; // pertambahan
             	case "-" : jawaban = x-y;
                        break; // pengurangan
             	case "%" : jawaban = x%y;
                break; // pembagian
             	default : System.out.println("Inputan kosong, mohon input ulang");
        }
    } else {
        	 System.out.println("Tidak bisa, mohon input ulang");
         }
         System.out.println(jawaban);
    }  
}


/* tutorial penggunaan nya, contoh kita input angka "5" lalu enter pada keyboard
    lalu input operasi nya, mau itu perkalian pemmbagian pengurangan ataupun pertambahan
    input kembali angka yang mau dilakukan operasi

    atau bisa langsung seperti "20 * 10" maka akan otomatis akan keluar output
*/