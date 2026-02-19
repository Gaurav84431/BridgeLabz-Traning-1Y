import java.util.*;

public class Program10 {
    static int[][] generate(int n) {
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                arr[i][j] = 10 + (int)(Math.random() * 90);
        return arr;
    }

    static String grade(double p) {
        if (p >= 80) return "A";
        if (p >= 70) return "B";
        if (p >= 60) return "C";
        if (p >= 50) return "D";
        if (p >= 40) return "E";
        return "R";
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] marks = generate(n);
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;
            per = Math.round(per * 100.0) / 100.0;
            System.out.println(total + " " + avg + " " + per + " " + grade(per));
        }
    }
}
