package DAO.Impl;

import DAO.StudentDAO;
import logic.Student;


import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import java.sql.SQLException;

import java.util.List;
import org.apache.log4j.Logger;

import javax.persistence.Query;


public class StudentDAOImpl implements StudentDAO {
 Logger logger= Logger.getLogger(StudentDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;


    public void addStudent(Student stud) throws SQLException {

        sessionFactory.getCurrentSession().save(stud);
    }

    public void updateStudent(Student stud) throws SQLException {
        sessionFactory.getCurrentSession().saveOrUpdate(stud);
    }

    public Student getStudentById(Long id) throws SQLException {
      /* List<Student> list=sessionFactory.getCurrentSession().createQuery("select s from Student s where s.id=:id").setParameter("id",id).list();
        Student student=list.get(0); */
        List<Student> list=sessionFactory.getCurrentSession().
                createCriteria(Student.class).list() ;
        Student student=list.get(0);
        return  student;
    }

    public List<Student> getAllStudents() throws SQLException {
       Session session= sessionFactory.getCurrentSession();
     Criteria criteria=session.createCriteria(Student.class);

        List student;

        student=criteria.list();
        logger.error(student);
        return   student;


    }

    public void deleteStudent(logic.Student stud) throws SQLException {
        sessionFactory.getCurrentSession().delete(stud);
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }
}