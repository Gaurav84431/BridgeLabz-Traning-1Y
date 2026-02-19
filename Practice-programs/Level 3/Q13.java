import java.util.*;

public class Q13 {
    static int[][] generate(int n){
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                arr[i][j]=10+(int)(Math.random()*90);
        return arr;
    }

    static double[][] calculate(int[][] arr){
        double[][] res=new double[arr.length][3];
        for(int i=0;i<arr.length;i++){
            int total=arr[i][0]+arr[i][1]+arr[i][2];
            double avg=total/3.0;
            double per=(total/300.0)*100;
            res[i][0]=total;
            res[i][1]=Math.round(avg*100.0)/100.0;
            res[i][2]=Math.round(per*100.0)/100.0;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] marks=generate(n);
        double[][] result=calculate(marks);
        for(int i=0;i<n;i++)
            System.out.println(marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]);
    }
}
