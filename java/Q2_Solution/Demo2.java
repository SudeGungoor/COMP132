
// Catching Exception exception.
import java.io.IOException;

public class Demo2 {
   // execute application
   public static void main(String[] args) {
      try {
         throw new ExceptionA();
      } 
      catch (Exception exception) {
         System.out.println(exception);
      }

      try {
         throw new ExceptionB();
      } 
      catch (Exception exception) {
         System.out.println(exception);
      } 

      try {
         throw new NullPointerException();
      }
      catch (Exception exception) {
         System.out.println(exception);
      } 

      try {
         throw new IOException();
      }
      catch (Exception exception) {
         System.out.println(exception);
      } 
   } 
}

// subclass of Exception
class ExceptionA extends Exception {
   // empty class body
} 

// subclass of ExceptionA
class ExceptionB extends ExceptionA {
   // empty class body
}

