import java.util.*;
class UserDiscount{
public static void main(String[][ args){
Scanner sc= new Scanner (System.in);
double fee=sc.nextDouble(),
p=sc.nextDouble();
System.out.println("Final Fee="+(fee-fee*p/100));
}
}