import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean invalid = true;
    
       System.out.println("Hello please pick cat(1) or dog(2)!");
       while(invalid) {
       int option = sc.nextInt();
            if(option == 1) {
                System.out.println("                      /^--^\\     /^--^\\     /^--^\\\n                      \\____/     \\____/     \\____/\n                     /      \\   /      \\   /      \\\n                    |        | |        | |        |\n                     \\__  __/   \\__  __/   \\__  __/\n|^|^|^|^|^|^|^|^|^|^|^|^\\ \\^|^|^|^/ /^|^|^|^|^\\ \\^|^|^|^|^|^|^|^|^|^|^|^|\n| | | | | | | | | | | | |\\ \\| | |/ /| | | | | | \\ \\ | | | | | | | | | | |\n########################/ /######\\ \\###########/ /#######################\n| | | | | | | | | | | | \\/| | | | \\/| | | | | |\\/ | | | | | | | | | | | |\n|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
                invalid = false;
            } else if (option == 2) {
                System.out.println("           __\n      (___()\'`;\n      /,    /`\n      \\\\\"--\\\\");
                invalid = false;
            } else if (option != 1 || option != 2) {
                System.out.println("Error Invalid Option.");
                System.out.println("Please insert cat or dog");
            }
        }
        
    }
}