package basic;

//Scanner class have a lot of function to read input
import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        // System.in use to read input from keyboard
        // First make object of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks");

        System.out.print("English: ");
        int num1 = input.nextInt();// It is a way to take input

        System.out.print("Hindi: ");
        int num2 = input.nextInt();

        System.out.print("Maths: ");
        int num3 = input.nextInt();

        System.out.print("Chemistry: ");
        int num4 = input.nextInt();

        System.out.print("Physics: ");
        int num5 = input.nextInt();

        int average = (num1+num2+num3+num4+num5)/5;
        System.out.print("The Total % = "+average);
    }
}
