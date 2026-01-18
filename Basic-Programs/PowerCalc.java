import java.util.Scanner;
public class PowerCalc{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter base number:");
double base = sc.nextDouble();
System.out.print("Enter power:");
double pow =sc.nextDouble();
double res = Math.pow(base,pow);
System.out.println("Result:"+res);
}
}