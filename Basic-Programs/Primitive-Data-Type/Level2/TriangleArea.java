import java.util.Scanner;
class TriangleArea{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double base = sc.nextDouble();
double height = sc.nextDouble();
double areaCm = 0.5*base*height;
double areaInch = areaCm/(2.54*2.54);
System.out.println("Area inch:"+ areaInch);
}
}