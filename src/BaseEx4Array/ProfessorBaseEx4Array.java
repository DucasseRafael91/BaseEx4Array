package BaseEx4Array;

import java.util.Scanner;
import java.util.ArrayList;

public class ProfessorBaseEx4Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notes = new ArrayList<>();
        boolean end_of_notes = false;

        System.out.print("Nom de l'élève : ");
        String last_name = scanner.nextLine();

        System.out.print("Prénom de l'élève : ");
        String first_name = scanner.nextLine();

        while (!end_of_notes) {
            System.out.print("Note de l'élève (ou -1 pour terminer) : ");
            if (scanner.hasNextDouble()) {
                double note = scanner.nextDouble();
                if (note == -1) {
                    end_of_notes = true;
                } else {
                    notes.add(note);
                }
            } else {

                System.out.println("Entrée invalide, veuillez saisir un nombre.");
                scanner.next(); 
            }
        }

        System.out.println("Élève : " + first_name + " " + last_name);
        System.out.println("Notes : " + notes);

        scanner.close();
    }
}
