package basic;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char com ;
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        if(randomNumber<=3){
            com = 'r';
        }
        else if(randomNumber>3 && randomNumber<=6){
            com = 's';
        }
        else{
            com = 'p';
        }
        System.out.println("Choose the 'r' for rock, 's' for scissor and 'p' for paper ");
        char user = sc.next().charAt(0);

        if(com == 'r' && user == 's'){           //Rock -> Scissor
            System.out.println("Computer wins");
        }
        else if (com == 's' && user == 'p') {    //Scissor -> Paper
            System.out.println("Computer wins");
        }
        else if (com == 'p' && user == 'r') {    //Paper -> Rock
            System.out.println("Computer wins");
        }
        else if (com == 'p' && user == 's') {    //Paper <- Scissor
            System.out.println("You wins");
        }
        else if (com == 'r' && user == 'p') {    //Rock <- Paper
            System.out.println("You wins");
        }
        else if (com == 's' && user == 'r') {    //Scissor <- Rock
            System.out.println("You wins");
        }
        else {                                   //Same == Same
            System.out.println("Tie");
        }
        System.out.printf("computer choose %c and you choose %c",com,user);
    }
}
