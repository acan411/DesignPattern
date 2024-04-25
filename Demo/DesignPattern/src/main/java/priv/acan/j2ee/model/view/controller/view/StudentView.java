package priv.acan.j2ee.model.view.controller.view;

/**
 * @author acan
 * @version 2023/03/04 14:01
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
