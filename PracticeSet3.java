package basic;

import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
//        Question 1
        String name = "NYCIL";
        System.out.println(name.toLowerCase());
//        System.out.println(name.replace('Y','A'));


//        Question 2
        String whiteSpace = "    ";
        System.out.println(whiteSpace.replace(" ","_"));

//        Question 3
        String template = "Dear |name|, Thanks a lot";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
//        String nam = sc.nextLine();
        String nam = "Java";
        System.out.println(template.replace("name",nam));

//        Question 4
        String space = "The triple space is not present  ";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

//        Question 5
        System.out.println("\"Dear Harry, This java course is nice Thanks\"");
    }
}
