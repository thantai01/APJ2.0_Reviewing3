
import java.time.format.DateTimeFormatter;
import java.util.*;

public class StudentManager implements Manager<Student>{
    public List<Student> studentList = null;

    public StudentManager() {
        this.studentList = new LinkedList<>();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void print() {
        for(Student student: studentList) {
            System.out.println(student);
        }
    }
    @Override
    public int findIndex(String id) {
        for(int i =0; i<studentList.size();i++) {
            if(studentList.get(i).getStudentID().equals(id))
                return i;
        }
        return -1;
    }

    @Override
    public void edit(String id, Student student) {
        int studentIndex = findIndex(id);
        if(findIndex(id)==-1) {
            System.out.println("Student not found");
        } else studentList.set(findIndex(id),student);
    }

    @Override
    public void delete(String id) {
        int studentIndex = findIndex(id);
        if (findIndex(id)==-1) {
            System.out.println("Cannot delete because student not found");
        } else studentList.remove(findIndex(id));
    }

    public void findByID(String ID) {
        for(Student student:studentList) {
            if(student.getStudentID().equals(ID)) {
                System.out.println(student + "\n");
            }
        }
    }

    public void findByGender(int gender) {
        for(Student student:studentList) {
            if(student.getStudentGender()==gender) {
                System.out.println(student + "\n");
            }
        }
    }

    public void findByAddress(String address) {
        for(Student student:studentList) {
            if(student.getStudentAddress().equals(address)) {
                System.out.println(student + "\n");
            }
        }
    }

    public void findByAvgScore(double min, double max) {
        for(Student student:studentList) {
            if(student.getStudentAvgScore()>=min && student.getStudentAvgScore()<=max) {
                System.out.println(student + "\n");
            }
        }
    }

    public void findByAgeRange(int min, int max) {
        for(Student student: studentList) {
            if(student.getAge(student.getStudentDOB().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))<max
                    && student.getAge(student.getStudentDOB().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))>min){
                System.out.println(student +"\n");
            }
        }
    }

    public void sortByID() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentID().compareTo(o2.getStudentID());
            }
        });
        List<Student> sortByID = new ArrayList<>();
        for(Student student:studentList) {
            sortByID.add(student);
        }
        this.studentList = sortByID;
    }

    public void sortByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }
        });
        List<Student> sortByName = new ArrayList<>();
        for(Student student: studentList) {
            sortByName.add(student);
        }
        this.studentList = sortByName;
    }

    public void sortByAge() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge(o1.getStudentDOB().format(DateTimeFormatter.ofPattern("yyyy")))-o2.getAge(o2.getStudentDOB().format(DateTimeFormatter.ofPattern("yyyy")));
            }
        });
        List<Student> sortByAge = new ArrayList<>();
        for(Student student:studentList) {
            sortByAge.add(student);
        }
        this.studentList = sortByAge;

    }

    public void sortByAvgScore() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.getStudentAvgScore()-o2.getStudentAvgScore());
            }
        });
        List<Student> sortByAvgScore = new ArrayList<>();
        for (Student student:studentList) {
            sortByAvgScore.add(student);
        }
        this.studentList = sortByAvgScore;
    }


}
