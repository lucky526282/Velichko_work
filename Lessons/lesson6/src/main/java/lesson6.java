import java.text.DecimalFormat;

/**
 * Created by Lucky on 29.11.2015.
 */
public class lesson6 {

    public static void main(String[] args) {

        int[][] arr = new int[5][];

        System.out.println("Triangle 1");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[arr.length - i];

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Triangle 2");

        int[][] array = new int[5][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        System.out.println("Triangle 3");

        int[][] ar = new int[5][];
            for (int i = 0; i < ar.length; i++) {
                 ar[i] = new int[i + 1];

            for (int k = ar.length-ar[i].length; k >= 0;k--)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < ar[i].length; j++)
                {
                    System.out.print(ar[i][j]);
                }
                System.out.println();
            }

        System.out.println("Triangle 4");

        int[][] array4 = new int[5][];
        for (int i = 0; i < ar.length; i++) {
            array4[i] = new int[arr.length - i];

            for (int k = array4.length-array4[i].length; k >= 0;k--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < array4[i].length; j++)
            {
                System.out.print(array4[i][j]);
            }
            System.out.println();
        }
    }


}



