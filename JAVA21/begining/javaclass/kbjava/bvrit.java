import java.util.*;

public class bvrit {
    static class Student {
        int rollno;
        String name;
        int internal1Mark, internal2Mark, assignmentMark;
        char grade;

        Student(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }
    }

    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to BVRIT ,affiliated to JNTU");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose option:\n1. Add student\n2. Add assignment marks\n3. Check if student passed\n4. Add student to extra curricular activity\n5. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    addAssignmentMarks(sc);
                    break;
                case 3:
                    checkPassed(sc);
                    break;
                case 4:
                    addToExtraCurricular(sc);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static void addStudent(Scanner sc) {
        System.out.println("Enter rollno and name: ");
        int rollno = sc.nextInt();
        String name = sc.next();
        Student s = new Student(rollno, name);
        studentList.add(s);
    }

    private static void addAssignmentMarks(Scanner sc) {
        System.out.println("Enter rollno and assignment marks: ");
        int rollno = sc.nextInt();
        int assignmentMarks = sc.nextInt();
        for (Student s : studentList) {
            if (s.rollno == rollno) {
                s.assignmentMark = assignmentMarks;
                break;
            }
        }
    }

    private static void checkPassed(Scanner sc) {
        System.out.println("Enter rollno: ");
        int rollno = sc.nextInt();
        for (Student s : studentList) {
            if (s.rollno == rollno) {
                int totalMarks = s.internal1Mark + s.internal2Mark + s.assignmentMark;
                if (totalMarks > 40) {
                    System.out.println("Student passed");
                } else {
                    System.out.println("Student failed");
                }
                break;
            }
        }
    }

    private static void addToExtraCurricular(Scanner sc) {
        System.out.println("Enter rollno and grade: ");
        int rollno = sc.nextInt();
        char grade = sc.next().charAt(0);
        for (Student s : studentList) {
            if (s.rollno == rollno) {
                s.grade = grade;
                break;
            }
        }
    }
}