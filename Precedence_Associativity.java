package basic;

public class Precedence_Associativity {
    public static void main(String[] args) {
/*
      Operators Precedence(Priority)
      Operators evaluate based on Priority
      It doesn't follow BODMAS rule
      If (+,-) have low priority than (*,/) then (*,/) operation evaluate first
*/
        //System.out.println(12*2+2-16/8);
        /*
        =24+2-2
        =26-2
        =24
         */

        /*
        Associativity : (*,\) operators have equal precedence
                        The associativity goes from left to right
         */
        //System.out.println(12*3/4);
        /*
        =12*3/4
        =36/4
        =9
         */

//        Quick Quiz 1
        int a = 1;
        int b = 4;
        int c = 1;
        System.out.println((a-b)/2F);
//        Quiz 2
        float k = (float) (b*b-4*a*c)/2*a;
        System.out.println(k);
//        Quiz 3
        System.out.println(a*a -b*b);
//        Quiz 4
        System.out.println(a*b-c);
    }
}
