<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<%--
  Created by IntelliJ IDEA.
  User: Technodrive
  Date: 15.02.13
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CRUD</title>
</head>
<body>

<stripes:form beanclass="crud.PageCreateActionBean" focus="">

    <table align="center"><tr><td><h1>Create</h1></tr>
        <tr>
            <td>

            </td>
        </tr>
        <tr>
            <td>
                 Возраст:
                <br>
                <stripes:text name="age"/>


            </td>
            </tr><tr>
            <td>
                Имя:
                <br>
                <stripes:text name="name"/>
                
            </td>
            </tr> <tr>
             <td>
                 <stripes:submit name="Add">Add</stripes:submit>
             </td>

            <br>

        </tr></table>
</stripes:form>

</body>
</html>