package priv.acan.j2ee.data.access.object.intf;

import priv.acan.j2ee.data.access.object.model.Student;

import java.util.List;

/**
 * @author acan
 * @since 2023/03/09 19:56
 */
public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}
