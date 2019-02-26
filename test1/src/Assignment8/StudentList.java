package Assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList implements IStudent {
    ArrayList<Student> arrStudent = new ArrayList<Student>();

    public StudentList(ArrayList<Student> arrStudent) {
        this.arrStudent = arrStudent;
    }

    public ArrayList<Student> getArrStudent() {
        return arrStudent;
    }

    public void setArrStudent(ArrayList<Student> arrStudent) {
        this.arrStudent = arrStudent;
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        int id, age;
        String name, address;
        float gpa;
        System.out.println("Input new Student: ");
        id = this.maxIndex() + 1;
        System.out.println("Name: ");
        name = scanner.nextLine().trim();
        System.out.println("Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine().trim();
        System.out.println("GPA: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();
        Student student = new Student(id, name, age, address, gpa);
        this.arrStudent.add(student);
    }

    @Override
    public void editStudent() {
        Scanner scanner = new Scanner(System.in);
        int id, age;
        int temp = 0;
        String name, address;
        float gpa;
        System.out.println("Edit Student: ");
        System.out.println("Input ID of Student to edit: ");
        id = scanner.nextInt();
        scanner.nextLine();
        for (Student std : this.arrStudent) {
            if (std.getId() == id) {
                temp++;
                //Enter new Name. Just Enter if no change
                System.out.println("Current Name: " + std.getName() + ". Enter new Name or just Enter if no change: ");
                name = scanner.nextLine().trim();
                if (!name.equals("")) {
                    std.setName(name);
                }
                //Enter new Age. Just Enter if no change
                System.out.println("Current Age: " + std.getAge() + ". Enter new Age or just Enter value 0 if no change: ");
                age = scanner.nextInt();
                scanner.nextLine();
                if (age != 0) {
                    std.setAge(age);
                }
                //Enter new Address. Just Enter if no change
                System.out.println("Current Address: " + std.getAddress() + ". Enter new Address or just Enter if no change: ");
                address = scanner.nextLine().trim();
                if (!address.equals("")) {
                    std.setAddress(address);
                }
                //Enter new Gpa. Just Enter if no change
                System.out.println("Current Gpa: " + std.getGpa() + ". Enter new Gpa or just Enter value 0 if no change: ");
                gpa = scanner.nextFloat();
                scanner.nextLine();
                if (gpa != 0) {
                    std.setGpa(gpa);
                }
                break;
            }
        }
        if (temp == 0) {//Student ID not found
            System.out.println("Student ID not found!");
        }
    }

    @Override
    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        int id;
        int temp = 0;
        System.out.println("Delete Student: ");
        System.out.println("Input ID of Student to delete: ");
        id = scanner.nextInt();
        scanner.nextLine();
        for (Student std : this.arrStudent) {
            if (std.getId() == id) {
                temp++;
                Student tempStudent = std;
                arrStudent.remove(tempStudent);
                break;
            }
        }
        if (temp == 0) {//Student ID not found
            System.out.println("Student ID not found!");
        }
    }

    @Override
    public void sortStudentByGpa() {
        Scanner scanner = new Scanner(System.in);
        Collections.sort(this.arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getGpa() - o2.getGpa());
            }
        });
        this.showStudent();
    }

    @Override
    public void sortStudentByName() {
        Scanner scanner = new Scanner(System.in);
        Collections.sort(this.arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });
        this.showStudent();
    }

    @Override
    public void showStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student List: ");
        for (Student std : arrStudent) {
            System.out.print("Id:" + std.getId() + "; Name:" + std.getName() + "; Age:" + std.getAge() + "; Address:" + std.getAddress() + "; GPA:" + std.getGpa() + "\n");
        }
    }

    @Override
    public int maxIndex() {
        int temp = 0;
        for (Student std : this.arrStudent) {
            if (std.getId() > temp) {
                temp = std.getId();
            }
        }
        return temp;
    }
}
