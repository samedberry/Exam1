import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        //define necessaries
        Scanner input1 = new Scanner(System.in);
        int sum = 0;
        int inputNumber = 1;

        //loop for input
        while(inputNumber != 0) {
            System.out.println("Please enter an integer. Enter 0 to finish and see the sum of all integers entered.");
            inputNumber = input1.nextInt();
            sum = sum + inputNumber;
        }

        //display sum
        System.out.println("The sum of the integers you entered is: " + sum);
    }
}
