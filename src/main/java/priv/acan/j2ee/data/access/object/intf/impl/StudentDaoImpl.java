package priv.acan.j2ee.data.access.object.intf.impl;

import priv.acan.j2ee.data.access.object.intf.StudentDao;
import priv.acan.j2ee.data.access.object.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2023/03/09 19:58
 */
public class StudentDaoImpl implements StudentDao {

    private final List<Student> students = new ArrayList<>();

    public StudentDaoImpl() {
        students.add(new Student("Robert", 0));
        students.add(new Student("John", 1));
    }


    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("StudentVO: Roll No " + student.getRollNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("StudentVO: Roll No " + student.getRollNo() + ", deleted from database");
    }
}
