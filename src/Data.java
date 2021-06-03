import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "ID,name,dob,age,gender,address,email,avg score";

    static void writeDataFile(String path, List<Student> students) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bfw = new BufferedWriter(fw);
        fw.append(FILE_HEADER);
        fw.append(NEW_LINE_SEPARATOR);
        for (Student student : students) {
            fw.write(student.getStudentID()+ ","
                    + student.getStudentName()+ ","
                    + student.getStudentDOB().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+ ","
                    + student.getAge(student.getStudentDOB().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))) + ","
                    + student.getGender(student.getStudentGender()) + ","
                    + student.getStudentAddress() + ","
                    + student.getStudentEmail() + ","
                    + student.getStudentAvgScore() + ","
                    + NEW_LINE_SEPARATOR
            );
        }
        System.out.println("Data has written to CSV file");
        fw.flush();
        bfw.close();
        fw.close();
    }

    static List<Student> readDataFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String content;
        List<Student> newList = new ArrayList<>();
        br.readLine();
        while((content = br.readLine())!=null) {
            String[] line = content.split(",");
                newList.add(new Student(line[0],line[1],line[2],
                        (genderBuilder(line[4])),
                        line[5],line[6],
                        (Double.parseDouble(line[7]))));
        }
        return  newList;
    }

    static int genderBuilder(String input) {
        if(input.equals("Male")) {
            return 0;
        } else if (input.equals("Female"))
            return 1;
        return -1;
    }
}
