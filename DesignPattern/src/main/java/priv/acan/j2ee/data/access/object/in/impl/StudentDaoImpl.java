package priv.acan.j2ee.data.access.object.in.impl;

import priv.acan.j2ee.data.access.object.in.StudentDao;
import priv.acan.j2ee.data.access.object.pojo.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2023/03/09 19:58
 */
public class StudentDaoImpl implements StudentDao {

    private final List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
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
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }
}
