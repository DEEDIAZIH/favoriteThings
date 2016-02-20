
package favoritethings;
import java.util.Scanner;

public class FavoriteThings {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your favorite color:");
        String color = keyboard.nextLine();
        System.out.println("Enter your favorite food:");
        String food = keyboard.nextLine();
        System.out.println("Enter your favorite animal:");
        String animal = keyboard.nextLine();
        System.out.println("Enter the first name of your friend:");
        String friend = keyboard.nextLine();
        
        System.out.println("I had a dream that " + friend + " ate a " + color + " " + 
                 animal + " and said it tasted like " + food + "!");
        
        
    }
    
}
