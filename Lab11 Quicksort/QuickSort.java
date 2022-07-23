/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Student
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] data = {69,200,44,1000,3,256,400,500,24,55,8,10,111,123,1,205};
        printAll(data);
        quickSort(data, 0, data.length-1);
        printAll(data);
    }
    public static void printAll(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }System.out.println("");
    }
    public static void quickSort(int[]a,int first,int last){
        if(first > last){
            // one item or no item
            return;
        }
            int lower = first+1; int upper = last;
            int pivot = first;
            while(lower <= upper){
                while(a[lower] < a[pivot] && lower <= last){
                    //search for something BIG number that is bigger than or eqaul pivot
                    lower++;
                }
                while(a[upper] >= a[pivot] && upper > first ){
                    // first is a pivot 
                    //search for SMALLER number that is smaller than pivot
                    upper--;
                }
                if(lower < upper){ // lower has not passed the upper
                    swap(a,lower++,upper--);
                } 
            }
            swap(a,upper,pivot); // swap pivot with upper
            if(first < upper-1){
                quickSort(a, first, upper-1);
            }
            if(upper+1 < last){
                quickSort(a, upper+1, last);
            }
        
        
        
        
    }
    public static void swap(int[] a,int lower,int upper){
            int temp = a[lower];
            a[lower] = a[upper];
            a[upper] =temp;
    }
}
