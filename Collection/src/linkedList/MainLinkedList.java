/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedList;

import java.util.LinkedList;



/**
 *
 * @author ASUS
 */
public class MainLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> lettersQ = new LinkedList<>();
        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");
        lettersQ.add("E");
        
        System.out.println("Linked List " + lettersQ.get(1));
        
        System.out.println("Linked List: " + lettersQ);
        System.out.println("Queue Size: " + lettersQ.size());
        
        while(!lettersQ.isEmpty())
            System.out.println(lettersQ.removeFirst());
        System.out.println("Linked list: " + lettersQ);
        
        LinkedList<String> lettersS = new LinkedList<>();
        
        lettersS.push("A");
        lettersS.push("B");
        lettersS.push("C");
        lettersS.push("D");
        lettersS.push("E");
        
        System.out.println("Linked List: " + lettersS);
        System.out.println("Stack size: " + lettersS.size());
        while(!lettersS.isEmpty())
            System.out.println(lettersS.removeFirst());
        System.out.println("Linked list: " + lettersS);
    }
    
}
