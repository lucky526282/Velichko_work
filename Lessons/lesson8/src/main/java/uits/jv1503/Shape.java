package uits.jv1503;

/**
 * Created by Lucky on 06.12.2015.
 */
public abstract class Shape {
   public static class Point{
       private int x;
       private int y;

        public Point (int x, int y){
            this.x = x;
            this.y = y;
        }

       public void setX(int x){
          this.x = x;
       }

       public void setY(int y){
           this.y = y;
       }
       public int getX(){
          return this.x;
       }

       public int getY(int y){
           return this.y;
       }
    }

    public abstract void draw();
    public abstract void moveHorizontal();
    public abstract void moveVertical();

    }

