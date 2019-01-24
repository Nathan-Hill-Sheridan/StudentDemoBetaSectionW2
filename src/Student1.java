/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student1;

/**
 *
 * @author Nathan
 */
class Student {

private String name;   
    
 public Student() {
  name = "your name";  
 }
 public Student(String name) {
  setName (name);  
 }
    
 public void setName(String a) {
this.name = a;
 }
    
 public String getName() {
  return name;  
 }
    
}
