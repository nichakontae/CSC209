/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlistlab;

/**
 *
 * @author Student
 */
public class SinglyLinkedList {
    ToiletPaper head,tail;
    
    public SinglyLinkedList(){
        head=tail=null;
    }
//    public SinglyLinkedList(){
//        
//    }
    public void addToHead(String b,double p,int l,String c){
       head  = new ToiletPaper(b,p,l,c,head); // next of new node is the current head
       if(tail == null){ // **** one node no point anywhere
           tail=head;
       }
    }
    public void addToTail(String b,double p,int l,String c){
           if(head == null){ // no node -> empty
            head=tail=new ToiletPaper(b,p,l,c,null);
        } else {
            tail.next = new ToiletPaper(b,p,l,c,null);// have node
            tail=tail.next;
            // tail = new ToiletPaper(b,p,l,c,null);
            // previous one not point to tail
            // but you can use this then you have to use for loop and put .next to that pervious one which is does not point to anywhere
            // for(t=head;t.next != null ; t=t.next)
            // then you found it -> t.next = tail;
        }      
    }
    public ToiletPaper DeleteFromHead(){
        ToiletPaper deletedNode = head;      
        if(head == tail){ //  no node or one node
            head=tail=null;
        }else {
           head=head.next; 
        }       
        return deletedNode;
    }
    
    public String DeleteFromTail(){    
        String deletedNode;
        if(head == tail) { // no node or one node
            head=tail=null;
            deletedNode ="";
        } else { // more than one node
            // seach the previous node before tail
            deletedNode = tail.toString();
            ToiletPaper temp;
            for(temp=head; temp.next!= tail ;temp=temp.next){         
            }
            // just for search not do anything inside loop 
            // just keep moving
            tail=temp;
            tail.next =null;
        }
        
        return deletedNode;
    }
    public void printAllToiletPaperColor(){
        // print color of all ToiletPaper               
        for( ToiletPaper temp = head;temp != null;temp=temp.next){
            System.out.print(temp.getColor()+" ");
        }
//        System.out.print(temp.getColor());
        System.out.println();
    }
}
