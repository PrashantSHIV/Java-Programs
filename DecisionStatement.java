package basic;

import java.util.Scanner;

public class DecisionStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell Your age boy");
        int age = sc.nextInt();
        boolean cond = (age>18);
        if(cond) {
            System.out.println("Yes Boy you can drive");
        }
        else {
            System.out.println("No You can't drive Yet");
        }
//        switch (age){
//            case 24:
//                System.out.println("You can go sir");
//                break;
//            case 18:
//                System.out.println("You can't drive Young Boy");
//                break;
//            case 14:
//                System.out.println("Go Home and Come when You will 19th");
//                break;
//        }
    }
}
