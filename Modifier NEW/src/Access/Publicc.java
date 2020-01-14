/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

/**
 *
 * @author ASNA
 */



public class Publicc {
  public String fname = "Aldi";
  public String lname = "Syahrialdi";
  public String email = "noorakmal198@gmail.com";
  public int age = 19;
}

class Person {
   
  public static void main(String[] args) {
    Publicc myObj = new Publicc(); 
    System.out.println("Nama    : " + myObj.fname + " \n" + myObj.lname);
    System.out.println("Email   : " + myObj.email);
    System.out.println("Umur    : " + myObj.age);
  }
}



