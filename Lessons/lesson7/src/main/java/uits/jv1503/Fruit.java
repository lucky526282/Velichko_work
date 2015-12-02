package uits.jv1503;

/**
 * Created by Lucky on 02.12.2015.
 */
public class Fruit {
    String color;
    private double weight;
    String taste;

    public Fruit(){
        color="Green";
        weight =0.125;
        taste="unknown";
    }
    public Fruit(double weight){
        color="Green";
        this.weight = weight;
        taste="unknown";
    }
    public Fruit( String color,double weight){
        color="Green";
        this.weight = weight;
        taste="unknown";
    }
    public void SetWeight (double weight){
        if (weight <0.02)
            System.out.println("To small");
        else if  (weight>10)
            System.out.println("To big");
        this.weight = weight;
    }
    public double GetWeight(){
       return this.weight;
    }
}
