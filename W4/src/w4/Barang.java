/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

/**
 *
 * @author Thor
 */
public class Barang {

    /**
     * @param args the command line arguments
     */
    String kode_barang; 
    String nama_barang; 
    private int stok; 
    
    public Barang(String kode, String nama, int stk) {  kode_barang = kode; 
    nama_barang = nama;  
    kode_barang = kode;
    setStok(stk);   
} 

      public int getStok(){
          return stok;
      }
      public void setStok(int stok){
          if(stok>0){
          this.stok += stok;
      }
      }
}
