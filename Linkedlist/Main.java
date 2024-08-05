/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlist;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Search Student");
            System.out.println("6. Sort Students by ID (Bubble Sort)");
            System.out.println("7. Sort Students by ID (Selection Sort)");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter mark: ");
                        double mark = scanner.nextDouble();
                        manager.addStudent(new Student(id, name, mark));
                        break;
                    case 2:
                        System.out.print("Enter ID: ");
                        id = scanner.nextInt();
                        System.out.print("Enter new name: ");
                        name = scanner.next();
                        System.out.print("Enter new mark: ");
                        mark = scanner.nextDouble();
                        manager.updateStudent(id, name, mark);
                        break;
                    case 3:
                        System.out.print("Enter ID: ");
                        id = scanner.nextInt();
                        manager.deleteStudent(id);
                        break;
                    case 4:
                        manager.displayStudents();
                        break;
                    case 5:
                        System.out.print("Enter ID to search: ");
                        id = scanner.nextInt();
                        manager.searchStudent(id);
                        break;
                    case 6:
                        manager.sortStudentsByIdBubbleSort();
                        System.out.println("Students sorted by ID (Bubble Sort):");
                        manager.displayStudents();
                        break;
                    case 7:
                        manager.sortStudentsByIdSelectionSort();
                        System.out.println("Students sorted by ID (Selection Sort):");
                        manager.displayStudents();
                        break;
                    case 8:
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice, please try again. ");
                }
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}