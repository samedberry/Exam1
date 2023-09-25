import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args){

        //prompt user for beverage selection
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please select a beverage:");
        System.out.println("Enter 1 for Water");
        System.out.println("Enter 2 for Coke");
        System.out.println("Enter 3 for Coffee");
        int beverage = input1.nextInt();

        //display beverage selection
        if (beverage == 1){
            System.out.println("You have selected Water.");
        } else if (beverage == 2){
            System.out.println("You have selected Coke.");
        } else if (beverage == 3){
            System.out.println("You have selected Coffee.");
        } else {
            System.out.println("You have not entered a valid beverage selection.");
        }
    }
}
