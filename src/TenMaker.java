import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        //define necessaries
        Scanner input1 = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int num1 = input1.nextInt();

        System.out.println("Please enter a second integer: ");
        int num2 = input1.nextInt();

        if (num1+num2 == 10){
            System.out.println("The sum of these integers is 10.");
        } else {
            System.out.println("The sum of these integers is not 10.");
        }
    }
}
