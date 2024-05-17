package basic;

public class LogicalOperator {
    public static void main(String[] args) {
        //LOGICAL Operator are used to evaluate condition for if else statement
//        AND &&, OR ||, NOT !
        boolean a = false;
        boolean b = false;
        if(a && b){
            System.out.println("Yes");
        }
        if(a || b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("NOT(a) is "+!(a));
        System.out.println("NOT(b) is "+!(b));
    }
}
