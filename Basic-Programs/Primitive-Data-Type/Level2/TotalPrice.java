import java.util.Scanner;
class TotalPrice{
public static void main(String[] args){
Scnner sc = new Scanner(System.in);
double price = sc.nextDouble();
int qty = sc.nextInt();
System.out.println("Total:"+(price*qty));
}
}