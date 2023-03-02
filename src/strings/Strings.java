package strings;

public class Strings {
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
