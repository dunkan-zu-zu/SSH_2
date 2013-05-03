package crud;

import DAO.StudentDAO;
import logic.Student;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import service.StudentService;
import service.StudentServiceImpl;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 19.02.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public class PageCreateActionBean implements  ActionBean
{
    private Logger logger=Logger.getLogger(PageUpdateActionBean.class);


    ActionBeanContext  actionBeanContext;

      @SpringBean
    StudentService studentService;



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

        if(null!=getAge()) { if(null!=getName()){

            studentService.addStudent(student);
        }}





        logger.warn("Create redirect");


        return new RedirectResolution("/crud/Crud.action");

    }




    @DefaultHandler
    public ForwardResolution view() throws SQLException {

        logger.warn("Create resolution");

        return new ForwardResolution("/WEB-INF/crud/create.jsp");

    }


}
