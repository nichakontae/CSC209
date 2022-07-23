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
public class OurStack {
    private int[] info;
    private int top;

    public OurStack(int capacity) {
        info= new int [capacity];
        // want 100 digit add together
        // size is 101 for one more carry
        top = 0;
    }
    
    // pop()
    // push()
    // topElement()
    // clear()
    // isEmpty()
    
    public void push(int newInfo){ // add new int 
        if(!isFull()){
            info[top] = newInfo;
            top++;
        } else {
            System.out.println("Stack is full. You cannot add a new member");
        }
        
    }
    
    public boolean isFull(){
        return top >= info.length;
    }
    
    public int pop(){ // take topeElemnt out 
       // return top that pop 
       int x;
       if(! isEmpty()){
            top--;
            x=info[top];
       } else {
            x=999;
            System.out.println("Stack is empty. There is nothing to pop.");
       }
       return x;
       
    }
    
    public int topElment(){
        if(top == 0){
            return -1;
        }
        // if top == 0 it will return -1 immediately not return below
        return info[top-1];              
    }
    
    public void clear(){
        top = 0;
    }
    
    public boolean isEmpty(){ 
        return top <= 0;
    }
    
    
}
