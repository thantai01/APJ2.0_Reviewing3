import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    private String studentID;
    private String studentName;
    private LocalDateTime studentDOB;
    private int studentGender;
    private String studentAddress;
    private String studentEmail;
    private double studentAvgScore;

    public Student() {
    }

    public Student(String studentID, String studentName, String studentDOB, int studentGender, String studentAddress, String studentEmail, double studentAvgScore) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDOB = LocalDateTime.parse(studentDOB, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentAvgScore = studentAvgScore;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDateTime getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(LocalDateTime studentDOB) {
        this.studentDOB = studentDOB;
    }

    public int getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(int studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public double getStudentAvgScore() {
        return studentAvgScore;
    }

    public void setStudentAvgScore(double studentAvgScore) {
        this.studentAvgScore = studentAvgScore;
    }
    public String getGender(int studentGender){
        String gender = "";
        if(studentGender==0) {
            gender = "Male";
        } else if(studentGender ==1) {
            gender ="Female";
        }
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID: '" + studentID + '\'' +
                ", Name: '" + studentName + '\'' +
                ", DOB: " + studentDOB +
                ", Gender: " + getGender(studentGender) +
                ", Address: '" + studentAddress + '\'' +
                ", Email: '" + studentEmail + '\'' +
                ", AvgScore: " + studentAvgScore +
                '}';
    }
}
