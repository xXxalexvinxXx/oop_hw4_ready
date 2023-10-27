import java.util.List;

public class TeacherController implements UserController<Teacher>{ //TeacherController расширяет UserController

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) { //Переопределили создание Учителя
        teacherService.create(firstName,secondName,lastName);
    }
    public List<Teacher> getAllTeachers(){
        return teacherService.getAll();
    }
    public void printAllTeachers(){
        teacherView.sendOnConsole(getAllTeachers());
    }
}
