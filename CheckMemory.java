package basic;
import java.util.Scanner;
import java.lang.String;


//Program that check your memory power
public class CheckMemory {
    public static void main (String[] args) {

        int count = 0;

        Scanner sc = new Scanner(System.in);
        String alpha = "PRGWABNKOFE";

        System.out.println("The characters are now displaying");
        for(int i = 0; i < 11; i++ ){
            System.out.print(alpha.charAt(i)+"\t");
        }

        System.out.println();

        System.out.println("Now Enter the character You have watched(UPPERCASE)");
        for(int i = 0; i < 11; i++ ){
            char a = sc.next().charAt(0);
            for(int j = 0; j < 11; j++ ){
                char b = alpha.charAt(j);
                if( a == b ){
                    count = count + 1;
                    alpha = alpha.replace(b,' ');
                }
            }
            System.out.println(count);
        }
        System.out.printf("You tells %d correct characters out of 11 ",count);

    }
}
