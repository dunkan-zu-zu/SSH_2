package crud;

import DAO.Factory;
import logic.Student;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.RedirectResolution;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 19.02.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public class DeleteActionBean implements ActionBean {
    ActionBeanContext actionBeanContext;
    private String result;
    private Long Id;
    private String id;

    public void setContext(ActionBeanContext actionBeanContext) {
        this.actionBeanContext=actionBeanContext;
    }


    public ActionBeanContext getContext() {
        return actionBeanContext;

    }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }
    public Long getremove() { return Id; }
    public void setremove(Long Id) { this.Id = Id; }



    @DefaultHandler
    public RedirectResolution
    Delete() throws SQLException{
        Student st= Factory.getInstance().getStudentDAO().getStudentById(this.Id);

        Factory.getInstance().getStudentDAO().deleteStudent(st);

        String str="   ";

        List<Student> studs = Factory.getInstance().getStudentDAO().getAllStudents();



        result=str;

        return new RedirectResolution("/crud/Crud.action");
    }





}
