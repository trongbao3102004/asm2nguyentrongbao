/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlist;

/**
 *
 * @author ASUS
 */
public class StudentManager {

    private Node head;

    public void addStudent(Student student) {
        if (head != null) {
            Node current = head;
            while (current != null) {
                if (current.getStudent().getId() == student.getId()) {
                    System.out.println("Student with ID " + student.getId() + " already exists");
                    return;
                }
                current = current.getNext();
            }
        }
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    public void updateStudent(int id, String name, double mark) {
        Node current = head;
        while (current != null) {
            if (current.getStudent().getId() == id) {
                current.getStudent().setName(name);
                current.getStudent().setMark(mark);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Student not found with ID: " + id);
    }
    public void deleteStudent(int id) {
        if (head == null) {
            System.out.println("Student list is empty.");
            return;
        }

        if (head.getStudent().getId() == id) {
            head = head.getNext();
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getStudent().getId() == id) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
        System.out.println("Student not found with ID: " + id);
    }
    public void displayStudents() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getStudent());
            current = current.getNext();
        }
    }
    public void searchStudent(int id) {
        Node current = head;
        while (current != null) {
            if (current.getStudent().getId() == id) {
                System.out.println("Student found: " + current.getStudent());
                return;
            }
            current = current.getNext();
        }
        System.out.println("Student not found with ID: " + id);
    }
        public void sortStudentsByIdBubbleSort() {
        Node current = head;
        Node index = null;
        Student temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.getNext();
                while (index != null) {
                    if (current.getStudent().getId() > index.getStudent().getId()) {
                        temp = current.getStudent();
                        current.setStudent(index.getStudent());
                        index.setStudent(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }
    public void sortStudentsByIdSelectionSort() {
        Node current = head;
        Node index = null;
        Node minNode = null;
        Student temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                minNode = current;
                index = current.getNext();
                while (index != null) {
                    if (index.getStudent().getId() < minNode.getStudent().getId()) {
                        minNode = index;
                    }
                    index = index.getNext();
                }
                if (minNode != current) {
                    temp = current.getStudent();
                    current.setStudent(minNode.getStudent());
                    minNode.setStudent(temp);
                }
                current = current.getNext();
            }
        }
    }
}

