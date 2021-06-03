import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Data {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "";

    static void writeDataFile(String path, List<Student> students) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bfw = new BufferedWriter(fw);
        for (Student student : students) {
            fw.write(student.getStudentID()+ ","
                    + student.getStudentName()+ ","
                    + student.getStudentDOB()+ ","
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
}
