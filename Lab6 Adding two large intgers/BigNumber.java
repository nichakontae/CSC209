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
public class BigNumber {
    private String number; // 123

    public BigNumber(String number) {
        this.number = number;
    }
    public BigNumber(int number) {
        this.number = number+""; // +"" -> String
    }
    
    
    
    public BigNumber add(BigNumber num2){ // 555
        /// "523" + "6789" = "7312" (BigNumber)
        // "7523" + "6789" = "14312"
        //  number + num2 = answer
        String answer="";
        // both empty -> either one not empty we continue
        OurStack op1 = new OurStack(number.length());
        OurStack op2 = new OurStack(num2.toString().length()); 
        // is not String you have to convert to String
        for(int i=0;i<number.length();i++){
            op1.push(number.charAt(i)-48); // convert ascii of int to int
//            System.out.print(op1.topElment());
        }
        for(int i=0;i<num2.toString().length();i++){
            op2.push(num2.toString().charAt(i)-48);
//            System.out.print(op2.topElment());
        }
        int size;
//        if(number.length() > num2.toString().length()){
//            size = number.length()+1;
//        } else {
//            size = num2.toString().length()+1;
//        }
        size = Math.max(number.length(), num2.toString().length())+1;
        OurStack ans = new OurStack(size);
        int carry=0;
        while(!(op1.isEmpty()) || !(op2.isEmpty())){            
            int a = (op1.isEmpty()? 0: op1.pop()) + 
                    (op2.isEmpty()? 0: op2.pop()) + 
                    carry;
            // if a = 17 
            ans.push(a%10);// 17%10 -> 7
            carry = a/10;//   17/10 -> 1
        }
        if(carry >0){ // have carry
            ans.push(carry);
        }
        while(!ans.isEmpty()){
            answer+= ans.pop(); // the first pop is the first digit
            // answer is 4893 the first pop is 4
        }
        
        return new BigNumber(answer);
    }
    
    public void add(int num2){
        
    }
    public String toString(){
        return number;
    }
}
