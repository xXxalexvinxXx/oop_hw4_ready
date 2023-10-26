import java.util.ArrayList;
import java.util.List;
import java.util.Collections; //для использования стандартной сортировки

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("sfn1", "ssn1", "sln1");
        studentController.create("sfn2", "ssn2", "sln2");
        studentController.create("sfn3", "ssn3", "sln3");
        studentController.create("sfn4", "ssn4", "sln4");
        studentController.create("sfn5", "ssn5", "sln5");
        studentController.create("sfn6", "ssn6", "sln6");
        TeacherController teacherController = new TeacherController();
        teacherController.create("tfn1", "tsn1", "tln1");
        teacherController.create("tfn2", "tsn2", "tln2");
        teacherController.create("tfn3", "tsn3", "tln3");
        studentController.getAllStudents();
        teacherController.getAllTeachers();
    }
}