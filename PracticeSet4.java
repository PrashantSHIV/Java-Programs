package basic;

import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        Question 1
        int a =10;
        if(a==11){
            System.out.println("You are 11 years old");
        }
        else {
            System.out.println("You are not 11");
        }
        Question 2
        System.out.println("Enter your marks out of 100");
        System.out.print("Math : ");
        int math = sc.nextInt();
        System.out.print("Chemistry : ");
        int chemistry = sc.nextInt();
        System.out.print("Physics : ");
        int physics = sc.nextInt();
        float total = (float) (math+chemistry+physics)/3;
        if(total >= 40 && math >= 33 && physics >= 33 && chemistry >= 33){
            System.out.println("You passed with "+total+"%");
        }
        else {
            System.out.println("You failed");
        }
*/

/*
        Question 3
        System.out.println("Whats your earning");
        float earning = sc.nextInt();
        float tax = 0;
        if(earning>250000 && earning<=500000){
            tax += (earning - 250000)*.05F;
        }
        if(earning>500000 && earning<=1000000){
            tax += (500000 - 250000)*.05F;
            tax += (earning - 500000)*.20F;
        }
        if(earning>1000000){
            tax += (500000 - 250000)*.05F;
            tax += (1000000 - 500000)*.20F;
            tax += (earning - 1000000)*.30F;
        }
        System.out.println("You will have to pay "+tax+" tax to the government");
*/

/*
        Question 4
        System.out.println("Enter the Number of Day");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
    }
 */

//        Question 5
        //Write a Program to check whether the year user entered is leap year or not
        System.out.println("Give Your Year");
        int year = sc.nextInt();
        //1900 2000 2004

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("The year "+year+" is leap year");
                }
                else{
                    System.out.println("The year is not leap year");
                }
            }
            else {
                System.out.println("The year "+year+" is leap year");
            }
        }
//        if(year%100==0){
//            if(year%400==0){
//                System.out.println("The year "+year+" is leap year");
//            }
//            else {
//                System.out.println("Not leap year");
//            }
//        }
//        else {
//            if(year%4==0){
//                System.out.println(year+" is leap year");
//            }
//            else {
//                System.out.println("Not leap year");
//            }
//        }

    }
}
