package priv.acan.j2ee.data.access.object;

import priv.acan.j2ee.data.access.object.in.StudentDao;
import priv.acan.j2ee.data.access.object.in.impl.StudentDaoImpl;
import priv.acan.j2ee.data.access.object.pojo.Student;

/**
 * @author acan
 * @since 2023/03/09 20:05
 */
public class DaoDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        //更新学生
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
