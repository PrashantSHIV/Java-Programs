package basic;

import java.util.Scanner;

public class PracticeSet5 {
    public static void main(String[] args) {
/*
  Question 1:
        Program to print
        * * * *
        * * *
        * *
        *
        for(int i=1; i<=4; i++){
            for(int j=i; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*
        Question 2:
        Sum of first n even number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of even number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum += i*2;
            i++;
        }
        System.out.println("The sum of first "+n+" even numbers is "+sum);
*/

/*
        Question 3:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }
*/

/*
        Question 4:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 10;
        while (i>=1){
            System.out.println(n+" x "+i+" = "+(n*i));
            i--;
        }
*/

/*
        Question 5,6:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get their factorial");
        int n = sc.nextInt();
        int factorial = 1;
        while(i>=1){
            factorial = factorial*i;
            i--;
        }
        for(int i=n ; i>=1 ; i--){
            factorial*=i;
        }
        System.out.println("The factorial of "+n+" is "+factorial);
*/

/*
        Question 7:
        int n = 8;
        int sum = 0;
        for (int i=1; i<=10 ; i++){
            sum+= n*i;
        }
        System.out.println(sum);


*/

/*
        Question 8:
      The sum of A.P 1,2,3,......,100 -> 5050
      Formula of sum of A.P -> n(a+l)/2
*/
/*
        int sum = 100*(1+100)/2;
        OR
        int sum = 0;
        for (int i=1; i<=100 ; i++){
            sum+= i;
        }
        System.out.println(sum);
*/


    }
}
