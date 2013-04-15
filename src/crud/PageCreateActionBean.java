package crud;

import DAO.Factory;
import logic.Student;
import net.sourceforge.stripes.action.*;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 19.02.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public class PageCreateActionBean implements ActionBean {
    ActionBeanContext actionBeanContext;

    private String result;
    private Long age;
    private String name;

    public void setContext(ActionBeanContext actionBeanContext) {
        this.actionBeanContext=actionBeanContext;
    }


    public ActionBeanContext getContext() {
        return actionBeanContext;    }

    public void setAge(Long age) {
        this.age=age;
    }


    public Long getAge() {
        return age;    }


    public void setName(String name) {
        this.name=name;
    }


    public String getName() {
        return name;    }


    public RedirectResolution  Add() throws SQLException {

        Student student=new Student();
        student.setAge(this.getAge());
        student.setName(this.getName());
        System.out.println(getName());
        System.out.println(getAge());
        if(null!=getAge())  if(null!=getName()) Factory.getInstance().getStudentDAO().addStudent(student);








        return new RedirectResolution("/crud/Crud.action");

    }




    @DefaultHandler
    public ForwardResolution view() throws SQLException {



        return new ForwardResolution("/WEB-INF/crud/create.jsp");

    }

}
