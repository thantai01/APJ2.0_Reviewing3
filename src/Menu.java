import java.util.Scanner;

public class Menu {

    static void menuIntro() {
        System.out.println("WELCOME ADMIN! WHAT ARE YOU TODAY?");
        System.out.println("LET'S CHOOSE WHAT ACTION YOU WANT");
    }

    static void menuAction() {
        System.out.println("# Action : ");
        System.out.println("1. Add new Student: ");
        System.out.println("2. Display Student List: ");
        System.out.println("3. Edit Student: ");
        System.out.println("4. Delete Student (By ID): ");
        System.out.println("5. Find Student: ");
        System.out.println("6. Sort Student List: ");
        System.out.println("7. Exit. ");
    }

    static void addStudent(StudentManager studentManager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("# Please enter Student information:");
        System.out.print("Student ID: ");
        String id = sc.nextLine();
        System.out.print("Student name: ");
        String name = sc.nextLine();
        System.out.print("Date of birth (dd-MM-yyyy): ");
        String dob = sc.nextLine();
        sc.nextLine();
        System.out.print("Student Gender : (0.Male, 1.Female) ");
        int gender = sc.nextInt();
        sc.nextLine();
        System.out.print("Student Address : ");
        String address = sc.nextLine();
        sc.nextLine();
        System.out.print("Student Email: ");
        String email = sc.nextLine();
        sc.nextLine();
        System.out.println("Student Average Score");
        double avg =sc.nextDouble();
        studentManager.add(new Student(id,name,dob,gender,address,email,avg));
    }
    static void deleteByID(StudentManager studentManager) {
        System.out.print("Enter a product ID want to delete: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        studentManager.delete(id);
    }
    static Student newStudent () {
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.print("New Student ID: ");
        String id = sc.nextLine();
        System.out.print("New Student Name: ");
        String name = sc.nextLine();
        System.out.print("New Student DOB: ");
        String dob = sc.nextLine();
        System.out.print("New Student Gender : ");
        int gender = sc.nextInt();
        sc.nextLine();
        System.out.print("New Student Address: ");
        String address = sc.nextLine();
        System.out.print("New Student email: ");
        String email = sc.nextLine();
        sc.nextLine();
        System.out.println("New Student Avg Score: ");
        double avg = sc.nextDouble();
        return new Student(id,name,dob,gender,address,email,avg) ;
    }

}
