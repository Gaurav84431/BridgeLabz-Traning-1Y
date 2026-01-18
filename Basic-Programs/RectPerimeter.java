import java.util.Scanner;
public class RectPerimeter{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length:");
double l=sc.nextDouble();
System.out.print("Enter width:");
double b=sc.nextDouble();
double ans= 2*(l+b);
System.out.println("Perimeter:"+ans);
}
}