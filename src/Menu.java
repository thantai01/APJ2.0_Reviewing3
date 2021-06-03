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
        System.out.println("7. Export Student List: ");
        System.out.println("8. Import Student List: ");
        System.out.println("9. Exit. ");
        System.out.println("What is your choice?: ");
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

    static Student newStudent (String id) {
        System.out.println("Update Student Information :");
        Scanner sc = new Scanner(System.in);
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

    static void findMenu(StudentManager studentManager) {
        System.out.println("5.1 Find by Student ID: ");
        System.out.println("5.2 Find by Student Gender: ");
        System.out.println("5.3 Find by Student Address: ");
        System.out.println("5.4 Find by Student Avg Score: ");
        System.out.println("5.5 Find by Student Age: ");
        Scanner sc=  new Scanner(System.in);
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Enter Student ID: ");
                sc.nextLine();
                String id = sc.nextLine();
                System.out.println("#Result: ");
                studentManager.findByID(id);
                break;
            case 2:
                System.out.println("Enter Student Gender (0. Male;1. Female): ");
                int gender = sc.nextInt();
                System.out.println("#Result: ");
                studentManager.findByGender(gender);
                break;
            case 3:
                System.out.println("Enter Student Address: ");
                String address = sc.nextLine();
                System.out.println("#Result: ");
                studentManager.findByAddress(address);
                break;
            case 4:
                System.out.println("Enter a min score: ");
                double min = sc.nextDouble();
                System.out.println("Enter a max score: ");
                double max = sc.nextDouble();
                System.out.println("#Result: ");
                studentManager.findByAvgScore(min,max);
                break;
            case 5:
                System.out.println("Enter min of Age: ");
                int minAge = sc.nextInt();
                System.out.println("Enter max of Age: ");
                int maxAge = sc.nextInt();
                System.out.println("#Result ");
                studentManager.findByAgeRange(minAge,maxAge);
                break;
            default:
                System.out.println("Invalid");
        }
    }

    static void sortMenu(StudentManager studentManager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("6.1: Sort by Student ID: ");
        System.out.println("6.2: Sort by Student Name: ");
        System.out.println("6.3: Sort by Student Age: ");
        System.out.println("6.4: Sort by Student Avg Score: ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                studentManager.sortByID();
                System.out.println("#New List after sort: ");
                studentManager.print();
                System.out.println("-----------------------");
                break;
            case 2:
                studentManager.sortByName();
                System.out.println("#New List after sort: ");
                studentManager.print();
                System.out.println("-----------------------");
                break;
            case 3:
                studentManager.sortByAge();
                System.out.println("#New List after sort: ");
                studentManager.print();
                System.out.println("-----------------------");
                break;
            case 4:
                studentManager.sortByAvgScore();
                System.out.println("#New List after sort: ");
                studentManager.print();
                System.out.println("-----------------------");
                break;

        }
    }

}
