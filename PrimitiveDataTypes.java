package basic;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        //Primitive data types -> Predefine data types

        int a= 5; // store integer value                 4 bytes
        float f = 5f; // store decimal value             4 bytes
        byte b = -128; // store no. between -128 to 127  1 bytes
        double d = 34; // store more decimal values      8 bytes
        short s = 3456; // store short integers value    2 bytes  -32768 to 32767
        long l = 1234566787690L; //store long integers value   8 bytes   -9*18 to 9*18-1
        char c = 'A'; // store character value (unicode) 2 bytes   0 to 65535(2^16 -1)
        boolean wrong = false; // store true or false    size depends on jvm
        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(d);
        System.out.println(s);
        System.out.println(l);
        System.out.println(c);
        System.out.println(wrong);
    }
}
