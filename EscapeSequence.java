package basic;

public class EscapeSequence {
    public static void main(String[] args) {
        // Escape Sequence -> \n \t \\ \"  or more

        System.out.println("Its about to \n rain"); // \n gives new line after print message before \n
        System.out.println("Its about to\train");   // \t gives tab space
        System.out.println("Its about to \" rain"); // After \ " can be print
        System.out.println("Its about to \\ rain"); // After \ the another \ can be print
    }
}
