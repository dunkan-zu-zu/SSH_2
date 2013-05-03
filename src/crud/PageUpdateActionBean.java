package crud;

import DAO.StudentDAO;
import logic.Student;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import service.StudentService;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 22.02.13
 * Time: 12:09
 * To change this template use File | Settings | File Templates.
 */
public class    PageUpdateActionBean implements ActionBean {
        private Logger logger=Logger.getLogger(PageUpdateActionBean.class);


    private ActionBeanContext actionBeanContext;
    private Long update_id;
    private Long age;
    private String name;

    @SpringBean
    StudentService studentService;



   //default
    public void setContext(ActionBeanContext actionBeanContext) {
        this.actionBeanContext=actionBeanContext;
    }


    public ActionBeanContext getContext() {
        return actionBeanContext;

    }

    public void setUpdate_id(Long update_id){
        this.update_id=update_id;
    }
    public Long getUpdate_id(){
        return update_id;
    }


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







    @DefaultHandler
    public ForwardResolution view() throws SQLException {

        logger.warn("Create resolution");
        return new ForwardResolution("/WEB-INF/crud/update.jsp");

    }

    public RedirectResolution update() throws SQLException{

        Student st=new Student();
        st.setId(update_id);
        if(age==null){return new RedirectResolution("/crud/PageUpdate.action");}
        st.setAge(age);
        if(name==null){return new RedirectResolution("/crud/PageUpdate.action");}
        st.setName(name);
        studentService.updateStudent(st);
        logger.warn("Create redirect");
        return new RedirectResolution("/crud/Crud.action");
    }


}