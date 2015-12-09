package uits.jv1503;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Lucky on 09.12.2015.
 */
public class App {
    public static void main(String[] args) {
        
        Random r = new Random();

        Point [] points = new Point [10];
        for(int i =0; i<10; i++){
            points[i]= new Point (r.nextInt(100),r.nextInt(100));
        }

        Arrays.sort(points);

        for(Point p : points ){
            System.out.println(p.toString());
        }
    }

}

