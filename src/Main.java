import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentManager studentManager = new StudentManager();
        baseList(studentManager);
        Menu.menuIntro();
        programProcess(studentManager);

    }
    static void baseList(StudentManager studentManager) {
        studentManager.add(new Student("C0321K1" ,"Nguyen van A","01-09-1993",0,"HP","nguyenvana@gmail.com",7.0));
        studentManager.add(new Student("C0321K2" ,"Phan van B","01-09-1997",0,"HN","phanvanb@gmail.com",7.5));
        studentManager.add(new Student("C0321G1" ,"Nguyen hoang C","01-09-1995",1,"HCM","nguyenhoangc@gmail.com",8.0));
        studentManager.add(new Student("C0321I2" ,"Hoang thi N","01-09-1994",1,"TB","hoangthin@gmail.com",7.2));
    }

    static void countItem(StudentManager studentManager) {
        int count =0;
        for(Student student: studentManager.studentList) {
            count+=1;
        }
        System.out.println("Have [" + count + "] students in list");
    }

    static void programProcess(StudentManager studentManager) throws Exception {
        Scanner sc = new Scanner(System.in);
        int actionInput;
        do {
            countItem(studentManager);
            Menu.menuAction();
            actionInput = sc.nextInt();
            switch (actionInput) {
                case 1:
                    Menu.addStudent(studentManager);
                    System.out.println("New Student has been added!");
                    System.out.println("---------------------------");
                    break;
                case 2:
                    System.out.println("#Student List :");
                    studentManager.print();
                    System.out.println("---------------------------");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    String oldID = sc.nextLine();
                    Student newStudent = Menu.newStudent(oldID);
                    studentManager.edit(oldID, newStudent);
                    System.out.println("Student has been updated!");
                    System.out.println("_________________________");
                    break;
                case 4:
                    System.out.println("Enter Student ID:");
                    sc.nextLine();
                    String deleteID = sc.nextLine();
                    System.out.print("ALERT: Do you want to delete this student?? ");
                    System.out.print("1. YES - 2. NO ");
                    int choose = sc.nextInt();
                    switch (choose) {
                        case 1:
                            studentManager.delete(deleteID);
                            System.out.println("Student has been deleted");
                            System.out.println("----------------------------");
                            break;
                        case 2:
                            System.out.println("Comeback later!");
                            System.out.println("------------------------");
                            break;
                    }
                    break;
                case 5:
                    Menu.findMenu(studentManager);
                    System.out.println("----------------------------------");
                    break;
                case 6:
                    Menu.sortMenu(studentManager);
                    System.out.println("----------------------------------");
                    break;
                case 7:
                    System.out.println("Enter destination file: ");
                    sc.nextLine();
                    String destination = sc.nextLine();
                    Data.writeDataFile(destination, studentManager.studentList);
                    System.out.println("Your data has been saved");
                    break;
                case 8:
                    sc.nextLine();
                    System.out.println("Enter path of data file: ");
                    String fromPath = sc.nextLine();
                    studentManager.studentList.clear();
                    studentManager.studentList = Data.readDataFile(fromPath);
                    System.out.println("Your list has been updated");
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid, re-enter");
            }
        } while (actionInput >0 && actionInput <999);
    }
}
