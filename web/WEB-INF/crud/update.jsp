<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<%--
  Created by IntelliJ IDEA.
  User: Technodrive
  Date: 22.02.13
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <stripes:form beanclass="crud.PageUpdateActionBean" focus="">

       <table align="center"><tr><td><h1>Create</h1></tr>
            <tr>
            <td>
                Возраст:
                <br>
                <input type="text" name="age" />


            </td>
            </tr>
            <tr>
            <td>
                Имя:
                <br>
                <input type="text" name="name" />

            </td>
            <tr>
            <td colspan="2">

                <input type="hidden" name="update_id" value="${actionBean.update_id}"/>

                <stripes:submit name="update" value="Upd" />

            </td>

            <br>

            </tr>
    </table>
</stripes:form>


</body>
</html>