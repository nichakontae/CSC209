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
public class SinglyLinkedListLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addToHead("Scott", 100.00, 10, "Pink");
        list1.addToHead("Scott", 300.00, 37, "Blue");
        // Pink
        // Blue point next to Pink
        System.out.println(list1.head.getColor());
        System.out.println(list1.tail.getColor());
        list1.addToHead("Gucci", 50000, 3, "Gold");
        // Gucci Gold wil be the new HEAD
        // Pink wil be the tail
        System.out.print(list1.head.getColor()+" "+list1.tail.getColor());
        System.out.println();
        // print Blue in the middle between Gold and Pink
        System.out.println(list1.head.next.getColor());
        list1.addToHead("Festa", 200, 12, "Orange");
        list1.addToHead("Festa",210,15,"Red");
        System.out.println(list1.head.getColor()+" "+list1.tail.getColor());
        // get Gold and Blue use next and next again and again
        System.out.println(list1.head.next.next.getColor()+" "+list1.head.next.next.next.getColor());
        list1.addToTail("Supream", 1000, 5, "Silver");
        // Red -> Orange -> Gold -> Blue -> Pink -> Silver
        System.out.println(list1.tail.getColor());
        list1.DeleteFromHead();       
        // Orange -> Gold -> Blue -> Pink -> Silver
        System.out.println(list1.head.getColor());
        list1.DeleteFromTail(); 
        // Orange -> Gold -> Blue -> Pink 
        System.out.println(list1.tail.getColor());
        list1.printAllToiletPaperColor();
    }
    
}
