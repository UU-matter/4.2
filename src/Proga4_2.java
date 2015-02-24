/**
 * Created by Александр on 24.02.2015.
 */
public class Proga4_2 {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5};
        int[] y = {6, 7, 8};
        int a=x.length+y.length;
        int[] z=new int[a];
        for( int i=0; i<z.length; i++) {
            if (i<x.length)
                z[i]=x[i];
            else z[i]=y[i-x.length];
            System.out.println(z[i]);

        }
    }
}