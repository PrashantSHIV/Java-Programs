package basic;

import java.util.Random;
//This Program generates the random Number
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);            //Generates random number from 1 to 10
        int randomNumber2 = random.nextInt(10,100); //Generates random number from 10 to 100
        System.out.println(randomNumber);
        System.out.println(randomNumber2);
    }
}
