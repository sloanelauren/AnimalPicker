import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    
       System.out.println("Hello please pick cat(1) or dog(2)!");
       int option = sc.nextInt();

       if(option == 1) {
        System.out.println("Cat ACSII art here:");
       } 
       else if (option == 2) {
        System.out.println("Dog ACSII art here:");
       } else {
        System.out.println("Error Invalid Option.");
        System.out.println("Please insert cat or dog");
    }
        
    }
}