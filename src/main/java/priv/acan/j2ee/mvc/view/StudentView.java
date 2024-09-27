package priv.acan.j2ee.mvc.view;

/**
 * @author acan
 * @since 2023/03/04 14:01
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("StudentVO: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
