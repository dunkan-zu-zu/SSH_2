package service;

import logic.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 22.04.13
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */

public interface   StudentService {


    public void addStudent(Student student) throws SQLException;   //добавить студента
    public void updateStudent(Student student) throws SQLException;//обновить студента
    public Student getStudentById(Long id) throws SQLException;    //получить стедента по id
    public List getAllStudents() throws SQLException;              //получить всех студентов
    public void deleteStudent(Student student) throws SQLException;//удалить студента
}