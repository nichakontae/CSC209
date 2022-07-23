/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionlab;

/**
 *
 * @author Student
 */
public class RecursionLab {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int exponential(int a,int b){
        if(b==0){
            return 1;
        }
        return a *exponential(a,b-1);
    }
    public static int divide(int divident, int divisor){
        // 20/6 => 20-6-6-6 =>3 2/6
        int count =0;
        for(count=0 ;divident>=divisor; count++){
            divident -=divisor;
        }
        return count;
    }
     public static int recursivlyDivide(int divident, int divisor){
        // 3/6=0
        // 15/6 = (15-6)/6 +1 = (9-6)/6 +1+1 = (3-6)+1+1+1
        if(divident>divisor){
            return 1+ recursivlyDivide(divident-divisor, divisor);
        }
        else {
            return 0;
        }
    }
    public static void printNto1(int n){
        if(n>0){
            System.out.print(n+ " ");
            printNto1(n-1);
        }
  
    }
    public static void print1toN(int n){
        if(n>0){
            print1toN(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(5));
        System.out.println(exponential(2,10));
        System.out.println(divide(24,6));
        System.out.println(recursivlyDivide(25,6));
        printNto1(10);
        System.out.println();
        print1toN(10);
    }
    
}
