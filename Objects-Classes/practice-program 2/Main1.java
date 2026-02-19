class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    public void display() {
        System.out.println(rollNumber + " " + name + " " + getCGPA());
    }
}

public class Main1 {
    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent();
        s.rollNumber = 101;
        s.name = "Arvind";
        s.setCGPA(8.5);
        s.display();
    }
}