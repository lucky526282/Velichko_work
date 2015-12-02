package uits.jv1503;

/**
 * Created by Lucky on 02.12.2015.
 */
public class App {
    public static void main(String[] args) {
        Fruit orange = new Fruit();
        Fruit watermelon = new Fruit(0.3);
        Fruit banana = new Fruit("Green",300);
        orange.SetWeight(111);
    }
}

