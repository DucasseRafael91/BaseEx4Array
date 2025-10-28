package BaseEx4Array;

import java.util.ArrayList;

public class BaseEx4Array {

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
