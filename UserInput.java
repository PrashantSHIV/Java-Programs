package basic;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        /*
         sc like an exam paper now students write their answer
         different submission is an objects
         sc is a new submission of paper
        */
          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Int");
//        int num = sc.nextInt();
//        System.out.println("Enter your Byte");
//        byte num1 = sc.nextByte();
//        System.out.println("Enter your float");
//        float num2 = sc.nextFloat();
//        System.out.println("Enter your short");
//        int num5 = sc.nextShort();
        System.out.println("Enter your sentence");
        String num3 = sc.nextLine();
        System.out.println(num3);

        System.out.println("Enter your string");
        String num4 = sc.next();
        System.out.println(num4);


        System.out.print("Enter your number:" );
        boolean arg = sc.hasNextInt();// If value int store true otherwise false
        System.out.println(arg);
    }
}
