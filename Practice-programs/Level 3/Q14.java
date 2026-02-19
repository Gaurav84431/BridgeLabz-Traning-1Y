import java.util.*;

public class Q14 {
    static int[][] create(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=(int)(Math.random()*10);
        return m;
    }

    static int[][] add(int[][] a,int[][] b){
        int[][] r=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                r[i][j]=a[i][j]+b[i][j];
        return r;
    }

    static int[][] sub(int[][] a,int[][] b){
        int[][] r=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                r[i][j]=a[i][j]-b[i][j];
        return r;
    }

    static int[][] mul(int[][] a,int[][] b){
        int[][] r=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b[0].length;j++)
                for(int k=0;k<b.length;k++)
                    r[i][j]+=a[i][k]*b[k][j];
        return r;
    }

    static void print(int[][] m){
        for(int[] row:m){
            for(int v:row) System.out.print(v+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] a=create(2,2);
        int[][] b=create(2,2);
        print(add(a,b));
        print(sub(a,b));
        print(mul(a,b));
    }
}
