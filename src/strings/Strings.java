/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Robson
 */
public class Strings {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String s1 = "Ola! Massa!";
    
    System.out.printf("String s1: %d%n", s1.length());
    
    System.out.printf("Char na posição 0: %c%n", s1.charAt(0));
    System.out.printf("Char na posição 5: %c%n", s1.charAt(5));
    System.out.printf("Char na posição 11: %c%n", s1.charAt(10));
    System.out.printf("Char na posição 15: %c%n", s1.charAt(8));
    
     System.out.printf("String s1: %d%n", s1.indexOf("assa"));
     
    String s2 = "hello";
    
    if ( s2.equalsIgnoreCase("Hello")) {
      System.out.println("s1 equal \"Hello\"");
    }
    else{
      System.out.println("s1 does not equal \"Hello\"");
    }
  }
  
}
