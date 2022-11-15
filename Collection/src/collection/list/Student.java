/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    private ArrayList<String> studentNames = new ArrayList();

    public void addStudents(String studentName, int idx) {
        if (idx == -1)
            this.studentNames.add(studentName);
        else
            this.studentNames.add(idx, studentName);
    }
    
    public void removeStudents(String studentName) {
        this.studentNames.remove(studentName);
    }
    
    public void sortstudents() {
        Collections.sort(studentNames);
    }
    
    public void displayStudents() {
        int i=0;
        for(String student: studentNames) {
            System.out.println("ID: " + (i+1) + "\tStudent Name: " + student);
            i++;
        }
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        student.addStudents("Anya Forger", -1);
        student.addStudents("Kim Taehyung", -1);
        student.addStudents("Superman", -1);
        student.sortstudents();
        student.displayStudents();
        System.out.println();
        student.addStudents("Rendy", 1);
        student.displayStudents();

    }
    
}
