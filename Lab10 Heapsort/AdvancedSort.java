/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedsort;

/**
 *
 * @author Student
 */
public class AdvancedSort {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] data = {44,55,2,77,29,23,300,52,76,22,19,3,100};
        printAll(data);
        heapSort(data);
        printAll(data);
    }
    public static void heapSort(int [] a){
        // 1. transform data to heap
        // from the middle of the heap to root
        for(int i=(a.length/2)-1;i>=0;i--){
            moveDown(a,i,a.length);
        }
        // 2. transform heap into a sorted array
        for(int i=a.length-1;i>0;i-- ){
             swap(a,i,0);
             moveDown(a,0,i);
             printAll(a);
        }
        
        
        
       
    }
    public static void swap(int[] a ,int nodeI,int nodeJ){
        int temp = a[nodeI];
        a[nodeI]= a[nodeJ];
        a[nodeJ]=temp;
    }
    public static void moveDown(int[]a,int i, int size){
        int leftChild = 2*i +1;
        int rightChild = 2*i +2;
        if(rightChild >= size){ // no rightChile
            rightChild = -1;
        }
        while(i <= size/2-1 && (a[i] < a[leftChild] 
                || rightChild > 0 && a[i] < a[rightChild])){
            // node i have a child or not? -> i <= size/2-1
            if(rightChild <0 || a[leftChild] > a[rightChild]){
                // no rightChild || left < right
                swap(a,i,leftChild);
                i = leftChild;
            } else {
                swap(a,i,rightChild);
                i= rightChild;
            }
            leftChild = 2*i+1; 
            rightChild = 2*i+2;
            if(rightChild>= size){
                rightChild = -1;
            }
            
        }
    }
    
    
    public static void printAll(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }System.out.println("");
    }
    
}
