/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largenumberadditionusingstack;

/**
 *
 * @author Student
 */
public class LargeNumberAdditionUsingStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OurStack st1 = new OurStack(4);
        st1.push(50);
        st1.push(93);
        System.out.println(st1.topElment());
        st1.push(34);
        System.out.println(st1.isEmpty()+" "+st1.isFull());
        st1.push(55);
        System.out.println(st1.isEmpty()+" "+st1.isFull());
        st1.push(97); // canot push 
        System.out.println(st1.pop()); // pop 55 
        System.out.println(st1.topElment()); // print 34
//        String a =  "3333333333333333333333333333333333333333"+
//                    "3333333333333333333333333333333333333333"+
//                    "3333333333333333333333333333333333333333"+
//                    "3333333333333333333333333333333333333333";
        String a = "3".repeat(300);
        BigNumber n1 = new BigNumber(a);
        BigNumber n2 = n1.add(new BigNumber(a));
        System.out.println(n2.toString()); 
        
        BigNumber n3 = new BigNumber(1);
        String b = "9".repeat(300);
        BigNumber n4 = n3.add(new BigNumber(b));
        System.out.println(n4.toString());
        
    }
    
}
