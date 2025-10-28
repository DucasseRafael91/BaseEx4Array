package BaseEx4Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor {

    public static void main(String[] args) {
    	// Fonction principale
    	
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        boolean moreStudents = true; // Booleen pour savoir si il faut rajouter des eleves

        while (moreStudents) { // Boucle pour rajouter des eleves

            String lastName = getInput(scanner, "Nom de l'élève : "); // Nom de l 'Eleve
            String firstName = getInput(scanner, "Prénom de l'élève : "); // Prenom de l 'Eleve

            ArrayList<Double> grades = getGrades(scanner); // Méthode pour ajouter les notes à l'eleve

            Student student = new Student(firstName, lastName, grades); // Creation de l'onjet Student
            students.add(student); // Ajout a la liste students

            displayStudentInfo(firstName, lastName, grades); // Affiche de l'eleve

            String answer = getInput(scanner, "Voulez-vous saisir un autre élève ? (oui/non) : ");
            
            if (answer.equalsIgnoreCase("non")) {
                moreStudents = false;
            }
        }

        searchAndDisplayStudent(students, scanner); // Recherche d'un eleve dans la liste Students
        scanner.close();
    }

    public static String getInput(Scanner scanner, String message) {
    	// Methode pour recuperer une saisie utilisateur
    	
        System.out.print(message);
        return scanner.nextLine();
    }

    public static ArrayList<Double> getGrades(Scanner scanner) {
    	// Methode pour inserer les notes à un eleve
    	
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
                scanner.next();
            }
        }

        scanner.nextLine();
        return grades;
    }

    public static void displayStudentInfo(String firstName, String lastName, ArrayList<Double> grades) {
        System.out.println("\nÉlève : " + firstName + " " + lastName);
        System.out.println("Notes : " + grades);

        if (!grades.isEmpty()) {
            double average = getAverage(grades);
            System.out.println("Moyenne : " + average);
        } else {
            System.out.println("Aucune note saisie.");
        }
    }

    public static double getAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void searchAndDisplayStudent(ArrayList<Student> students, Scanner scanner) {
        String searchLastName = getInput(scanner, "\nEntrez le nom de l'élève à rechercher : ");
        String searchFirstName = getInput(scanner, "Entrez le prénom de l'élève à rechercher : ");

        boolean found = false;
        
        for (Student student : students) {
            if (student.getLastName().equalsIgnoreCase(searchLastName)
                    && student.getFirstName().equalsIgnoreCase(searchFirstName)) {
                System.out.println("\nÉlève trouvé !");
                displayStudentInfo(student.getFirstName(), student.getLastName(), student.getGrades());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nÉlève non trouvé.");
        }
    }
}
