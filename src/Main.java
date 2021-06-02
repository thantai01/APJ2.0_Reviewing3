import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Student st1 = new Student("0001" ,"A","01-09-1993",0,"HN","A@gmail.com",7.0);
        Student st2 = new Student("0002","B","02-09-1995",0,"HN","B@gmail.com",6.0);
        Student st3 = new Student("0003","C","03-09-1991",1,"HN","C@gmail.com",6.5);
        studentManager.add(st1);
        studentManager.add(st2);
        studentManager.add(st3);
        studentManager.print();

    }
}
