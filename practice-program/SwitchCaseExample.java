import java.util.Scanner;
class SwitchCaseExample{
public static void main ( String[] args){
Scanner ab = new Scanner (System.in);
int a;
System.out.println("Enter a Number: ");
a= ab.nextInt();
switch(a){
case 1 : System.out.print("Hello World !!");
break;
case 2 : System.out.print("Hello Java");
break;
default : System.out.print("Heyyyyyyy");
break;
}
ab.close();
}
}