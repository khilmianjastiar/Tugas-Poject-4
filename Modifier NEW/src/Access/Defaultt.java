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
class Defaultt {
  String fname = "Aldi";
  String lname = "Syahrialdi";
  String email = "noorakmal198@gmail.com";
  int age = 19;
  
  public static void main(String[] args) {
    Defaultt myObj = new Defaultt();
    System.out.println("Nama  : " + myObj.fname + "\n " + myObj.lname);
    System.out.println("Email : " + myObj.email);
    System.out.println("Umur  : " + myObj.age);
  }    
}
