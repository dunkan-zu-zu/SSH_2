package crud;

import DAO.Factory;
import logic.Student;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 19.02.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public class CrudActionBean implements ActionBean {
    ActionBeanContext actionBeanContext;

    private String result;
    private Long Id;

    public void setContext(ActionBeanContext actionBeanContext) {
        this.actionBeanContext=actionBeanContext;
    }


    public ActionBeanContext getContext() {
        return actionBeanContext;

    }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }








    @DefaultHandler
    public ForwardResolution view() throws SQLException {
        String str="";

        List<Student> studs = Factory.getInstance().getStudentDAO().getAllStudents();


        for(int i = 0; i < studs.size(); ++i) {

            str+="Имя студента : " + studs.get(i).getName() + ", Возраст : " + studs.get(i).getAge()+ " Id:"+studs.get(i).getId()+
          "<form action=\"/crud/Delete.action\" method=\"post\"> <button type=\"submit\" name=\"remove\" value=\""+studs.get(i).getId()+"\">DELETE</button>"+"</form>"+
                    "<form action=\"/crud/PageUpdate.action\" method=\"post\"> <button type=\"submit\" name=\"update_id\" value=\""+studs.get(i).getId()+"\">UPDATE</button>"+"</form>"+"<br>";

        }
        result=str;

        return new ForwardResolution("/WEB-INF/crud/index.jsp");

    }





}
