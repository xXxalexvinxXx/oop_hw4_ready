import java.util.List;

public class StudentController implements UserController{

    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName,secondName,lastName);
    }
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }
    public void printAllStudent(){
        studentView.sendOnConsole(getAllStudents());
    }
}
