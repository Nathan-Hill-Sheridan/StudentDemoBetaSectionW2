/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan
 */
import java.util.Scanner;
class studentTest {
    public static void main(String [] args) {   
    Scanner in = new Scanner(System.in);
    Student s1 = new Student("Nathan");
    Student s2 = new Student("Riley");
    Student s3 = new Student("Lee");
    Student s4 = new Student("Stephen");
    Student s5 = new Student("Ethan");
    
    String [] arr = new String [5];
 
    arr[0] = s1.getName();
    arr[1] = s2.getName();
    arr[2] = s3.getName();
    arr[3] = s4.getName();
    arr[4] = s5.getName();
    
    for(int dex = 4; dex >= 0; dex--) {
    System.out.println(arr[dex]);
    }
    
    
    
    }
}
