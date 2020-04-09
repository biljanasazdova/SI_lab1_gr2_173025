import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Faculty {
    List <Student> studentList;
    String FacultyName;

    public Faculty(List<Student> studentList, String facultyName) {
        this.studentList = studentList;
        FacultyName = facultyName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }

    public void addStudent(List<Student> studentList){
        List<Student> student= new List<Student>();
        for (int i=0; i<studentList.size(); i++){
            if(student!=studentList(i)){
                studentList.add(student);
            }
        }
    }

    public void removeStudent(List<Student> studentList){
        List<Student> student= new List<Student>();
        for (int i=0; i<studentList.size(); i++){
            if(student==studentList(i)){
                studentList.remove(student);
            }
        }
    }
}