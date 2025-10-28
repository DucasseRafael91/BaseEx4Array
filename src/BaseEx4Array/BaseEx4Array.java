package BaseEx4Array;

import java.util.ArrayList;
import java.util.Arrays;

public class BaseEx4Array {

    public static void main(String[] args) {

        ArrayList<Double> grades = new ArrayList<>(Arrays.asList(12.5, 8.0, 15.75, 10.0, 18.25, 14.0));

        double min = getMin(grades);
        double max = getMax(grades);
        double average = getAverage(grades);

        System.out.println("Note la plus petite : " + min);
        System.out.println("Note la plus grande : " + max);
        System.out.println("Moyenne des notes  : " + average);
    }

    public static double getMin(ArrayList<Double> grades) {
        double min = grades.get(0);
        for (double grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public static double getMax(ArrayList<Double> grades) {
        double max = grades.get(0);
        for (double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public static double getAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
