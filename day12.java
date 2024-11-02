
/*
Solution – Day 12: Inheritance
 * Objective
 * Today, we’re delving into Inheritance.
 * 
 * Task
 * You are given two classes, Person and Student, where Person is the base class
 * and Student is the derived class. Completed code for Person and a declaration
 * for Student are provided for you in the editor. Observe that Student inherits
 * all the properties of Person.
 * 
 * Complete the Student class by writing the following:
 * 
 * A Student class constructor, which has 4 parameters:
 * A string, firstName.
 * A string, lastName.
 * An integer, idNumber.
 * An integer array (or vector) of test scores, scores.
 * A char calculate() method that calculates a Student object’s average and
 * returns the grade character representative of their calculated average:
 * Input Format
 * The locked stub code in the editor reads the input and calls the Student
 * class constructor with the necessary arguments. It also calls the calculate
 * method which takes no arguments.
 * 
 * The first line contains firstname, lastName, and idNumber, separated by a
 * space. The second line contains the number of test scores. The third line of
 * space-separated integers describes scores.
 * 
 * Constraints
 * 1 <= length of firstName, length of lastName <= 10
 * length of idNumber = 7
 * 0 <= score <= 100
 * Output Format
 * Output is handled by the locked stub code. Your output will be correct if
 * your Student class constructor and calculate() method are properly
 * implemented.
 * 
 * Sample Input
 * 
 * Heraldo Memelli 8135627
 * 2
 * 100 80
 * Sample Output
 * 
 * Name: Memelli, Heraldo
 * ID: 8135627
 * Grade: O
 * Explanation
 * 
 * This student had 2 scores to average: 100 and 80. The student’s average grade
 * is (100 + 800) / 2 = 90. An average grade of 90 corresponds to the letter
 * grade O, so the calculate() method should return the character'O'.
 */
import java.util.Scanner;

class Person {

    protected String firstName;

    protected String lastName;
    protected int idNumber;
    // Constructor

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {

        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate() {
        int total = 0;

        for (int testScore : testScores)
            total += testScore;

        int avg = total / testScores.length;
        if (avg >= 90 && avg <= 100)
            return 'O';
        if (avg >= 80 && avg < 90)
            return 'E';
        if (avg >= 70 && avg < 80)
            return 'A';
        if (avg >= 55 && avg < 70)
            return 'P';
        if (avg >= 40 && avg < 55)
            return 'D';
        return 'T';
    }
}

public class day12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}