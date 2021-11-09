/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;
import java.util.Scanner;
/**
 *
 * @author ryanbrilianfatsena
 */
public class ArrayProcessing {
    int [] dataBilangan = new int[100];
    int x, i, j;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Input Data Di Bawah Ini : ");
        this.x = input.nextInt();
            for(i = 0; i < x; i++){
                System.out.println("Masukan Bil Ke - " + (i+1)+ " : ");
                this.dataBilangan[i] = input.nextInt();
            }
    }
    
    double hitungRatarata(int[] dataArray){
        double sum = 0;
        for(i = 0;i < this.x; i ++){
            sum += dataArray[i];
        }
        double ratarata = sum / this.x;
        return ratarata;
    }
    
    int cariMax(int[] dataArray){
        int max = dataArray[0];
        for(i = 0; i < this.x; i ++){
            if (max < dataArray[i]){
                max = dataArray[i];
            }
        }
        return max;
    }
    
    int cariMin(int[] dataArray){
        int min = dataArray[0];
        for(i = 0; i < this.x; i ++){
            if (min > dataArray[i]){
                min = dataArray[i];
            }
        }
        return min;
    }
	
    void output(){
    System.out.println("Ratarata Dari Data Tersebut Yaitu       : " + this.hitungRatarata(this.dataBilangan));
    System.out.println("Nilai Minimum Dari Data Tersebut Yaitu  : " + this.cariMin(this.dataBilangan));
    System.out.println("Nilai Maximum Dari Data Tersebut Yaitu  : " + this.cariMax(this.dataBilangan));
    
    }
}
