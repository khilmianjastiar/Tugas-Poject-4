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
class Protected {
  protected String fname = "Aldi";
  protected String lname = "Syahrialdi";
  protected String email = "noorakmal198@gmail.com";
  protected int age = 19;
}

class Student extends Protected {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Nama           : " + myObj.fname+" \n" + myObj.lname);
    System.out.println("Email          : " + myObj.email);
    System.out.println("Umur           : " + myObj.age);
    System.out.println("Tahun Kelulusan: " + myObj.graduationYear);
  }
}



