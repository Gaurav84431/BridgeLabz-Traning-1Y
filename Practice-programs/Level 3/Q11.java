import java.util.*;

public class Q11 {
    static double[][] generate(int n){
        double[][] arr=new double[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=10000+(int)(Math.random()*90000);
            arr[i][1]=1+(int)(Math.random()*10);
        }
        return arr;
    }

    static double[][] calculate(double[][] arr){
        double[][] res=new double[arr.length][3];
        for(int i=0;i<arr.length;i++){
            double bonus=arr[i][1]>5?0.05:0.02;
            res[i][0]=arr[i][0];
            res[i][1]=arr[i][0]*bonus;
            res[i][2]=arr[i][0]+res[i][1];
        }
        return res;
    }

    public static void main(String[] args){
        double[][] data=generate(10);
        double[][] result=calculate(data);
        for(int i=0;i<10;i++)
            System.out.println(result[i][0]+" "+result[i][1]+" "+result[i][2]);
    }
}
