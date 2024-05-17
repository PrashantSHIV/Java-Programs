package basic;

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
/*
        String is sequence of character
        String is represent as follows:
*/
        String name ;
        name = "Hello World";
        System.out.println(name);
//        OR
        String Class = new String("High");
        System.out.println(Class);
//        OR
        String Place = "My Era";
        System.out.println(Place);


//     String is class, but we can use it as a data type
//     String is immutable and can't be change that store in memory
//     , but reference can point to another string
        name = "Again";
        System.out.println(name);


    /* Different way to print in java */

        int a = 5;
        float b = 8.56f;
        System.out.print("The value of a and b is "+a+" and "+b);
        System.out.println();

        //It gives a new line after Print
        System.out.println("The value of a and b is "+a+" and "+b);

        System.out.printf("The value of a and b is %d and %.2f",a,b);
        System.out.println();

        System.out.format("The value of a and b is %d and %.2f\n",a,b);


//        Input String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Phone = sc.nextLine(); //It takes all word
        System.out.print("Enter Your Mobile No.: ");
        String Mobile = sc.next(); //It takes only one word
        System.out.printf("%s\t",Phone);
        System.out.printf(Mobile);
    }
}
