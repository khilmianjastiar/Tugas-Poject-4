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
public class Privatt {
  private String fname = "Aldi";
  private String lname = "Syahrialdi";
  private String email = "noorakmal198@gmail.com";
  private int age = 24;
  
  public static void main(String[] args) {
    Privatt myObj = new Privatt();
    System.out.println("Nama : " + myObj.fname + "\n " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Umur : " + myObj.age);
  }
}

    
