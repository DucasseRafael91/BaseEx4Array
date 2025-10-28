package BaseEx4Array;

public class BaseEx4Array {

    public static void main(String[] args) {

        double[] notes = {12.5, 8.0, 15.75, 10.0, 18.25, 14.0};

        double min = getMin(notes);
        double max = getMax(notes);
        double moyenne = getMoyenne(notes);

        System.out.println("Note la plus petite : " + min);
        System.out.println("Note la plus grande : " + max);
        System.out.println("Moyenne des notes  : " + moyenne);
    }

    public static double getMin(double[] notes) {
        double min = notes[0];
        for (double note : notes) {
            if (note < min) {
                min = note;
            }
        }
        return min;
    }

    public static double getMax(double[] notes) {
        double max = notes[0];
        for (double note : notes) {
            if (note > max) {
                max = note;
            }
        }
        return max;
    }

    public static double getMoyenne(double[] notes) {
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }
}
