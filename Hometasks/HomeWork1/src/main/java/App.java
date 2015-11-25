/**
 * Created by Lucky on 24.11.2015.
 */
public class App {
    public static void main(String [] args)
    {

        task1();
        task2();
        task3();
        task4();

    }
    static void task1()
    {
        System.out.println("\n       Task1");
        int a= 19;
        byte b = 2;
        short c = 123;
        double d = 14.6;
        long e =66583;
        float f =9.23f;

        char ch ='a';

        int r = (int) c;
        short sh =(short) b;
        long lg= (long)a;
        int in= (int)ch;
        double db= a;

        System.out.println( r + " "+ sh+" "+ lg +" "+in+" "+db);
    }
 static void task2()
 {
     System.out.println("\n       Task2");
     int a = 7;
     int b =9;
     a = a+b;
     b = a-b;
     a= a-b;
     System.out.println("a = "+a);
     System.out.println("b = "+b);
 }
    static void task3()
    {
        System.out.println("\n       Task3");
        int a =13;
        int b =5;
        System.out.println( a+" % "+ b+" = "+a%b);
    }
    static void task4()
    {
        System.out.println("\n       Task4");

        byte b = Byte.MAX_VALUE;
        System.out.println((byte)(b+1));

        short sh = Short.MAX_VALUE;
        System.out.println((short)(sh+1));

        int i = Integer.MAX_VALUE;
        System.out.println((int)(i+1));

        long lg = Long.MAX_VALUE;
        System.out.println((long)(lg+1));

        float fl = Float.MAX_VALUE;
        System.out.println((float)(fl+1));

        double db = Double.MAX_VALUE;
        System.out.println((double)(db+1));

    }
}
