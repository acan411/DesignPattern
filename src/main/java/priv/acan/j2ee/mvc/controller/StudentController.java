package priv.acan.j2ee.mvc.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import priv.acan.j2ee.mvc.model.StudentModel;
import priv.acan.j2ee.mvc.view.StudentView;

/**
 * @author acan
 * @since 2023/03/04 14:01
 */
@Data
@AllArgsConstructor
public class StudentController {

    private StudentModel model;
    private StudentView view;

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
