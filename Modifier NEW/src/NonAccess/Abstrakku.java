package NonAccess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASNA
 */
abstract class Abstrakku {
    // Code from filename: Person.java
// abstract class
  public String fname = "Aldi";
  public int age = 19;
  public abstract void study(); // abstract method
}
// Subclass (inherit from Person)
class Student extends Abstrakku {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Belajar sepanjang hari");
  }
}
// End code from filename: Person.java
// Code from filename: MyClass.java
class Aku {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student();

    System.out.println("Nama            : " + myObj.fname);
    System.out.println("Umur            : " + myObj.age);
    System.out.println("Tahun Kelulusan : " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}

