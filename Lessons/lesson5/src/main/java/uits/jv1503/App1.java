package uits.jv1503;

/**
 * Created by Lucky on 25.11.2015.
 */
public class App1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int c = a++;
        int d = ++b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // 2

        int x = Compare (a,b);

        if (x>0){
            System.out.println("a > b");
        } else if (x<0){
            System.out.println("a < b");
        }else {
            System.out.println("a = b");
        }
    }
    public static int Compare (int a, int b){

        return a-b;
    }
}
