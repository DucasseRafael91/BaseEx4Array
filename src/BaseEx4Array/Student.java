package BaseEx4Array;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> grades;

    public Student(String firstName, String lastName, ArrayList<Double> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
}
