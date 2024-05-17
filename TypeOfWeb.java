package basic;

import java.util.Scanner;

public class TypeOfWeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Url of website");
        String url1 = sc.next();
//        String url2 = "IImt.org";
//        String url3 = "IndianForce.in";
        if(url1.endsWith(".com")){
            System.out.println("Website is Commercial Website");
        }
        else if(url1.endsWith(".org")){
            System.out.println("Website is Organization Website");
        }
        else if(url1.endsWith(".in")){
            System.out.println("Website is Indian Website");
        }
    }
}
