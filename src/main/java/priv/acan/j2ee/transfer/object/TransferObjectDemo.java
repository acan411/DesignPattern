package priv.acan.j2ee.transfer.object;

import priv.acan.j2ee.transfer.object.business.StudentBO;
import priv.acan.j2ee.transfer.object.model.StudentVO;

/**
 * @author acan
 * @since 2023/03/10 20:22
 */
public class TransferObjectDemo {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        // 输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("StudentVO: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        // 更新学生
        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        // 获取学生
        student = studentBusinessObject.getStudent(0);
        System.out.println("StudentVO: [RollNo : "
                + student.getRollNo() + ", Name : " + student.getName() + " ]");

        // 删除学生
        studentBusinessObject.deleteStudent(student);
    }
}
