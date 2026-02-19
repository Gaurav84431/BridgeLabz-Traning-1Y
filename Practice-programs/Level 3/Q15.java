import java.util.*;

public class Q15 {
    static int[][] create(int n){
        int[][] m=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                m[i][j]=(int)(Math.random()*5+1);
        return m;
    }

    static int[][] transpose(int[][] m){
        int n=m.length;
        int[][] t=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                t[j][i]=m[i][j];
        return t;
    }

    static int det2(int[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    static int det3(int[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    static double[][] inverse2(int[][] m){
        int d=det2(m);
        double[][] r=new double[2][2];
        r[0][0]=m[1][1]/(double)d;
        r[0][1]=-m[0][1]/(double)d;
        r[1][0]=-m[1][0]/(double)d;
        r[1][1]=m[0][0]/(double)d;
        return r;
    }

    static void print(int[][] m){
        for(int[] row:m){
            for(int v:row) System.out.print(v+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] m=create(3);
        print(m);
        print(transpose(m));
        System.out.println(det3(m));
    }
}
