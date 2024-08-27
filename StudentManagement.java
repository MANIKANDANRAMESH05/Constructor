package Pack1;

import java.util.Scanner;

class StudentData {
    String name;
    String panNumber;
    long aadharNumber;
    int mobileNumber;
    String emailAddress;

    // Constructor to initialize StudentData
    public StudentData(String name, String panNumber, long aadharNumber, int mobileNumber, String emailAddress) {
        this.name = name;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }

    // Default constructor
    public StudentData() {
    }

    // Method to collect student data
    public static StudentData[] collectStudentData(int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        StudentData[] studentDataArray = new StudentData[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("PAN Number: ");
            String panNumber = scanner.next();
            System.out.print("Aadhar Number: ");
            long aadharNumber = scanner.nextLong();
            System.out.print("Mobile Number: ");
            int mobileNumber = scanner.nextInt();
            System.out.print("Email Address: ");
            String emailAddress = scanner.next();
            studentDataArray[i] = new StudentData(name, panNumber, aadharNumber, mobileNumber, emailAddress);
        }
        
        scanner.close(); // Close the scanner
        return studentDataArray;
    }

    // Method to print student data
    public static void displayStudentData(StudentData[] studentDataArray) {
        for (StudentData studentData : studentDataArray) {
            System.out.println("Name: " + studentData.name);
            System.out.println("PAN Number: " + studentData.panNumber);
            System.out.println("Aadhar Number: " + studentData.aadharNumber);
            System.out.println("Mobile Number: " + studentData.mobileNumber);
            System.out.println("Email Address: " + studentData.emailAddress);
            System.out.println(); // Blank line for readability
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        StudentData[] studentDataArray = StudentData.collectStudentData(numberOfStudents);
        StudentData.displayStudentData(studentDataArray);
        scanner.close(); // Close the scanner
    }
}
