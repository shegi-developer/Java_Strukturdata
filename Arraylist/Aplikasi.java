
package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Aplikasi {

   
    public static void main(String[] args) {
        System.out.println("__________________________________________________________________________________________");
        System.out.println("--------------------------- DATA KEPEMILIKAN KENDARAAN MOBIL ---------------------------");
        System.out.println("__________________________________________________________________________________________");
        
        int pilihan;
        boolean kondisi = false;
        
        String merekmobil;
        String namapemilik;
        Integer tahunkeluar;
        Integer harga;
        
        Scanner input = new Scanner(System.in);
        ArrayList<Mobil> mobil = new ArrayList<Mobil>();
        
        while (kondisi == false) {            
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input Data Kepemilikan Mobil  ");
            System.out.println("2. Tampil Data Kepemilikan Kendaraan Mobil  ");
            System.out.println("3. Hapus Data Kepemilikan Mobil ");
            System.out.println("4. Cari Data Kepemilikan Mobil  ");
            System.out.println("5. Keluar ");
            System.out.print("Masukan Menu Pilihan[1,2,3,4,5] : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                
                  case 1:
                      // input data
                      System.out.println("__________________________________________________________________________________________");
                      System.out.println("-- Penginputan data kepemilikan mobil :");
                      System.out.println("__________________________________________________________________________________________");
                      int jawab = 1;
                      
                      while(jawab == 1){
                          
                          Mobil objek = new Mobil("merek", "pemilik",2010, 100000);
                          
                          System.out.print("-- Masukan Merek Mobil        : ");
                          merekmobil = input.next();
                          objek.setMerekmobil(merekmobil);
                          
                          System.out.print("-- Masukan Nama Pemilik Mobil : ");
                          namapemilik = input.next();
                          objek.setNamapemilik(namapemilik);
                          
                          System.out.print("-- Masukan Tahun Keluar Mobil : ");
                          tahunkeluar = input.nextInt();
                          objek.setTahunkeluar(tahunkeluar);
                          
                          System.out.print("-- Masukan Berapa Harga Mobil : ");
                          harga = input.nextInt();
                          objek.setHarga(harga);
                          
                          mobil.add(objek);
                          System.out.println("__________________________________________________________________________________________");
                          System.out.print("-- Apakah masih ada mobil yang ingin di input ? [1=ya],[2 = tidak]");
                          pilihan = input.nextInt();
                          if(pilihan == 2){
                              System.out.println("__________________________________________________________________________________________");
                              break;
                          }
                          System.out.println("__________________________________________________________________________________________");
                          
                      }
                      
                      break;
                  
                  case 2:
                      // tampil data
                     System.out.println("__________________________________________________________________________________________");
                     System.out.println("-- Data kepemilikan kendaraan mobil");
                     System.out.println("__________________________________________________________________________________________");
                      
                      for(int i = 0; i<mobil.size(); i++){
                          System.out.println("-- Data ke : "+(i+1));
                          System.out.print("-- Nama Pemilik Mobil : "+mobil.get(i).getNamapemilik());
                          System.out.print("| Merek : "+mobil.get(i).getMerekmobil());
                          System.out.print("| Tahun Keluar : "+mobil.get(i).getTahunkeluar());
                          System.out.println("| Harga : "+mobil.get(i).getHarga());
                          System.out.println("__________________________________________________________________________________________");
                      }
                      break;
                   
                  case 3:
                      // hapus data
                      break;
                      
                  case 4:
                      // cari data
                      break;
                  
                  case 5:
                      kondisi = true;
                      System.out.println("__________________________________________________________________________________________");
                      System.out.println("------------------------ TERIMA KASIH , SILAHKAN BERISTIRAHAT YAH ------------------------");
                      System.out.println("__________________________________________________________________________________________");
                      break;
                      
                  default:
                      System.out.println("__________________________________________________________________________________________");
                      System.out.println("------------------------ MAAF MENU INPUTAN TIDAK ADA  ------------------------");
                      System.out.println("__________________________________________________________________________________________");


            }
        }
        
    }
    
}
