package Assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<Student> arrStudent = new ArrayList<Student>();
        while (true){
            System.out.println("MANAGE STUDENT: ");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by gpa.");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. Exit.");
            System.out.println("Your choice: ");

            s = scanner.nextLine().trim();
            StudentList studentList = new StudentList(arrStudent);

            switch (s){
                case ("1"): //=========Add Student =============
                    studentList.addStudent();
                    break;
                case ("2"): //=========Edit Student =============
                    studentList.editStudent();
                    break;
                case ("3"): //=========delete Student =============
                    studentList.deleteStudent();
                    break;
                case ("4"): //=========sort Student by GPA =============
                    studentList.sortStudentByGpa();
                    break;
                case ("5"): //=========sort Student by name =============
                    studentList.sortStudentByName();
                    break;
                case ("6"): //=========show Student =============
                    studentList.showStudent();
                    break;
                case ("0"): //=========Exit =============
                    return;
                default:
                    System.out.println("Wrong choice. Please input again.");
                    break;
            }

        }
    }

}
