import java.util.Scanner;
public class KmMiles{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter value in KM:");
double km= sc.nextDouble();
double miles= km*0.621371;
System.out.println("In Miles:"+miles);
}
}