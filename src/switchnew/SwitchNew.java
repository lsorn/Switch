package switchnew;
import java.util.Scanner;
public class SwitchNew {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a b or c: ");
    String ch = input.nextLine();
   switch (ch) {
       case "a" :
           System.out.println(ch);
       case "b" :
            System.out.println(ch);
        
       case "c" : 
            System.out.println(ch);
          
       default:
            System.out.print("hello");
            break;
        }
        
       
    }
    
}