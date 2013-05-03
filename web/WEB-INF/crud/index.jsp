
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

<stripes  beanclass="crud.CrudActionBean" focus="">

<table align="center"><tr><td><h1>CRUD</h1></tr>
<tr>
<td>

            ${actionBean.result}

</td>

     <br>

</tr>

</table>
</stripes >
<table align="center">
    <tr>
        <td>
            <input value="Create" onclick="location.href='/crud/PageCreate.action'" type="button" />
        </td>
    </tr>

    </table>
</body>
</html>