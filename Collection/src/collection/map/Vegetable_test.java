/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection.map;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class Vegetable_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> vegBowl = new HashMap<>();
        addElements("Tomato", "Red", vegBowl);
        addElements("Carrot", "Orange", vegBowl);
        addElements("Cabbage", "Green", vegBowl);
        
        displayElements(vegBowl);
        
        getValue("Carrot", vegBowl);
    }
    
    public static void addElements(String key, String value, HashMap<String, String> vegBowl) {
        vegBowl.put(key, value);
    }
    
    public static void getValue(String key, HashMap<String, String> vegBowl) {
        if(vegBowl.get(key) == null)
            System.out.println("tetot");
        else
            System.out.println(vegBowl.get(key));
    }
    
    public static void displayElements(HashMap<String, String> vegBowl) {
        for(HashMap.Entry<String,String> vegetable: vegBowl.entrySet())
            System.out.println("vegetable : " + vegetable.getKey() + "\tColor : " + vegetable.getValue());
    }
    
}
