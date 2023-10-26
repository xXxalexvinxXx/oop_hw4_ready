import java.util.List;

public class TeacherController implements UserController{ //TeacherController расширяет UserController

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) { //Переопределили создание Учителя
    }
    public List<Teacher> getAllTeachers(){
        return teacherService.getAll();
    }
    public void printAllTeachers(){
        teacherView.sendOnConsole(getAllTeachers());
    }
}
