/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpelarraylistproject;
import java.util.Scanner;
import static java.util.Collections.binarySearch;
import java.util.ArrayList;
/**
 *
 * @author ryanbrilianfatsena
 */
public class AppArrayList {
    ArrayList <String> DATA = new ArrayList<>();
    
    void Tambahkan_Data() {
        Scanner tambahkan = new Scanner(System.in);
        print("Masukkan Data String : ");
        DATA.add(tambahkan.nextLine());
        print("Daftar String Dalam Array List :" + DATA);
        tambahkan.nextLine();
    }
    void Mencari_Data() {
        Scanner carikan = new Scanner(System.in);
        print("Silahkan Pilih String Yang Mau Dicari : ");
        String mencari = carikan.nextLine();
        if(binarySearch(DATA, mencari) > -1){
            print("String " + mencari + " Ada Di Index Ke " + binarySearch(DATA,mencari) +" Di Dalam Data");
        } else {
            print("String " + mencari + " Tidak Ada Dalam Data");
        }
        
    }
    void Menghapus_Data() {
        Scanner menghapus = new Scanner(System.in);
        print("Silahkan Pilih String Yang Mau Dihapus : ");
        String menghapuskan = menghapus.nextLine();
        if(binarySearch(DATA, menghapuskan) > -1){
            DATA.remove(binarySearch(DATA, menghapuskan));
            print("String " + menghapuskan + " Sudah Dihapus Di Dalam Data");
        } else {
            print("String " + menghapuskan + " Tidak Ada Dalam Data");
        }
        
    }
    
    void Menampilkan_Data() {
        System.out.println("Daftar String Dalam Array List :" + DATA);
    }
    static void print(String text) {
        System.out.println(text);
    }
}
