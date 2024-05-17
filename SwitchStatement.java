package basic;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //Switch statement is used to choose b/w No. of alternatives/choices
        //This is Enhanced Way of switch Statement
        switch (a) {
            case 18 -> System.out.println("You are now adult");
            case 21 -> System.out.println("You can get married");
            case 60 -> System.out.println("Now you are going to get retire");
            default -> System.out.println("Enjoy your life");
        }
    }
}
