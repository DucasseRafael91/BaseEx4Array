package BaseEx4Array;

import java.util.ArrayList;
import java.util.Scanner;
import BaseEx4Array.BaseEx4Array;

public class ProfessorBaseEx4Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastName = getInput(scanner, "Nom de l'élève : ");
        String firstName = getInput(scanner, "Prénom de l'élève : ");

        ArrayList<Double> grades = getGrades(scanner);

        displayStudentInfo(firstName, lastName, grades);

        scanner.close();
    }

    // 🔹 Lecture d'une chaîne de texte
    public static String getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    // 🔹 Lecture des notes
    public static ArrayList<Double> getGrades(Scanner scanner) {
        ArrayList<Double> grades = new ArrayList<>();
        boolean finished = false;

        while (!finished) {
            System.out.print("Note de l'élève (ou -1 pour terminer) : ");
            if (scanner.hasNextDouble()) {
                double grade = scanner.nextDouble();
                if (grade == -1) {
                    finished = true;
                } else {
                    grades.add(grade);
                }
            } else {
                System.out.println("Entrée invalide, veuillez saisir un nombre.");
                scanner.next(); // vide la mauvaise entrée
            }
        }

        scanner.nextLine(); // vide le buffer
        return grades;
    }

    // 🔹 Affichage des informations de l'élève
    public static void displayStudentInfo(String firstName, String lastName, ArrayList<Double> grades) {
        System.out.println("\nÉlève : " + firstName + " " + lastName);
        System.out.println("Notes : " + grades);

        if (!grades.isEmpty()) {
            double average = BaseEx4Array.getAverage(grades);
            System.out.println("Moyenne : " + average);
        } else {
            System.out.println("Aucune note saisie.");
        }
    }
}
