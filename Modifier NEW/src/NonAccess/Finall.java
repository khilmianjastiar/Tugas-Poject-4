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
public class Finall {
  final int X = 10;
  final double P = 3.14;

  public static void main(String[] args) {
    Finall myObj = new Finall();
    myObj.X = 10; 
    myObj.P = 3,14; 
    System.out.println(myObj.X);
  }
}

