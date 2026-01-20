class Student{
int id;
String name;
int age;
void displayDetails(){
String Status ="Active";
System.out.println("id:"+id);
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Status:"+Status);
}
public static void main(String[] args){ 
Student s1 = new Student();
s1.id = 27;
s1.name = "Gaurav Tripathi";
s1.age = 18;
s1.displayDetails();
}
}