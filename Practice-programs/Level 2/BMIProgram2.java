import java.util.*;

public class BMIProgram2 {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static String[] getAllBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            status[i] = getStatus(data[i][2]);
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            double bmi = calculateBMI(weight, height);

            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
        }

        String[] result = getAllBMIStatus(data);

        for (int i = 0; i < result.length; i++) {
            System.out.println("BMI: " + data[i][2] + " Status: " + result[i]);
        }
    }
}
