import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        //get inputs
        System.out.println("Please enter an integer: ");
        int num1 = input1.nextInt();

        System.out.println("Please enter a second integer: ");
        int num2 = input1.nextInt();

        //displays response
        if (makes10(num1, num2)){
            System.out.println("The sum of these integers is 10.");
        } else {
            System.out.println("The sum of these integers is not 10.");
        }
    }

    //checks inputs
    public static boolean makes10(int num1, int num2){
        if (num1+num2 == 10){
            return(true);
        } else {
            return(false);
        }

    }
}
