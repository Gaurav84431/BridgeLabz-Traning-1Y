import java.util.Scanner;
class DistanceConversion{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double feet = sc.nextDouble();
System.out.println("Yards:"+(feet/3));
System.out.println("Miles:"+(feet/5280));
}
}