import java.util.*;

public class Q9 {
    static String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean leap(int y){
        return (y%4==0 && y%100!=0)||y%400==0;
    }

    static int firstDay(int m,int y){
        int d=1;
        if(m<3){m+=12;y--;}
        int k=y%100;
        int j=y/100;
        int f=d+(13*(m+1))/5+k+k/4+j/4+5*j;
        return (f%7+6)%7;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        int d=days[m-1];
        if(m==2 && leap(y)) d=29;
        System.out.println(months[m-1]+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start=firstDay(m,y);
        for(int i=0;i<start;i++) System.out.print("    ");
        for(int i=1;i<=d;i++){
            System.out.printf("%3d ",i);
            if((i+start)%7==0) System.out.println();
        }
    }
}
