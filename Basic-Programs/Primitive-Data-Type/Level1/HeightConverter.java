import java.util.*;
class HeightConverter{
public static void main(String[][ args){
Scanner sc= new Scanner(System.in);
double in=sc.nextDouble()/2.54;
System.out.println((int)(in/12)+"feet"+(in%12)+"inches");
}
} 