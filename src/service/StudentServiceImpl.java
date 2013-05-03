package service;

import DAO.Impl.StudentDAOImpl;
import DAO.StudentDAO;
import logic.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 22.04.13
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public void addStudent(Student student) throws SQLException {
        studentDAO.addStudent(student);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) throws SQLException {
        studentDAO.updateStudent(student);
    }

    @Override
    @Transactional
    public Student getStudentById(Long id) throws SQLException {
        return studentDAO.getStudentById(id);
    }

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
    public List getAllStudents() throws SQLException {
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public void deleteStudent(Student student) throws SQLException {
        studentDAO.deleteStudent(student);
    }


    public void setStudentDAO(StudentDAOImpl studentDAO) {
        this.studentDAO=studentDAO ;

    }
}
