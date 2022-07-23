/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.*;

/**
 *
 * @author Student
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] data ={400,20,50,33,100,94,5,30,56,22};
       int[] data2 = {499,20,80411,74531,81503,8433,100,1294,5,430,256,222};
       System.out.println("Merge Sort");
       printAll(data);
       mergeSort(data,0,data.length-1);
       printAll(data);
        System.out.println("Radix Sort");
        printAll(data2);
        radixSort(data2);
        printAll(data2);
    }
    public static void mergeSort(int[]a,int first,int last){
        if(first<last){
            // have element
            int mid = (first+last)/2;
            mergeSort(a,first,mid);
            mergeSort(a,mid+1,last);
            merge(a,first,last);
        }
    }
    public static void merge(int[]a,int first,int last){
        int [] result = new int[last-first+1];
        int mid = (first+last)/2;
        int left = first;
        int right = mid+1;
        int iResult=0;
        while(left<=mid && right<=last){
            // keep goinh inside array
            if(a[left] < a[right]){
                result[iResult++]=a[left++];
            }else {
                result[iResult++] =a[right++];
            }
            
        }
        while(left<=mid){
            // some member of left sunarray have not been copied to the result
            result[iResult++] = a[left++];
        }
        while(right<=last){
            // some member of right sunarray have not been copied to the result
            result[iResult++]=a[right++];
        }
        // copy all to original array
        for(int i=0;i<last-first+1;i++){
            a[first+i]=result[i];
        }
        
        
    }
    
    public static void radixSort(int []arr){
        int radix = 10; // your number is a decimal number
        int digits = 5;
        // actually should use loop to find max digit
        Queue<Integer>[] piles = new Queue[radix];
        for(int i=0;i<piles.length;i++){
            piles[i] = new LinkedList<>();
        }
        int factor=1;
        for(int i=0;i<digits;i++){
            for(int j=0;j<arr.length;j++){
                int pileNumber = (arr[j]/factor)%10;
                piles[pileNumber].add(arr[j]);
                // enqueue into the piles queue
            }
            // dequeue from each pile and put them into the original arr data
            for(int k=0,x=0 ;k<radix;k++){
                while(! piles[k].isEmpty() ){
                    arr[x++]= piles[k].remove();// dequeue
                }
            }
            factor*=10;
        }
        
        
        
        
    }
    
    public static void printAll(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }System.out.println("");
    }
    
}
