package priv.acan.j2ee.transfer.object.business;

import priv.acan.j2ee.transfer.object.pojo.StudentVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2023/03/10 20:18
 */
public class StudentBO {

    private final List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();
        StudentVO robert = new StudentVO("Robert", 0);
        StudentVO john = new StudentVO("John", 1);
        students.add(robert);
        students.add(john);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }
}
