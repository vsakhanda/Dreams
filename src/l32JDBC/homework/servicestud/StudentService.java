package l32JDBC.homework.servicestud;


import l32JDBC.homework.crudstud.StudentManager;
import l32JDBC.homework.modelstud.Student;

import java.sql.SQLException;

public class StudentService {


    private final StudentManager studentManager;

    public StudentService() {
        this.studentManager = new StudentManager();
    }

    public void createStudent(Student student) throws SQLException {
        studentManager.insertStudent(student);
    }

    public Student getStudentById(int id) throws SQLException {
        return studentManager.findStudentById(id);
    }

    public void updateStudent(Student student) throws SQLException {
        studentManager.updateStudent(student);
    }

    public void deleteStudent(int id) throws SQLException {
        studentManager.deleteStudent(id);
    }



}
