<%--
  Created by IntelliJ IDEA.
  User: IrianLaptop
  Date: 7/16/2017
  Time: 12:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
Authorized users only

<table class="formtable">
<tr>
    <td>Username</td> <td>Email</td> <td>Role</td><td>Enabled</td>
</tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>
                <c:out value="${user.username}"></c:out>
            </td>
            <td>
                <c:out value="${user.email}"></c:out>
            </td>
            <td>
                <c:out value="${user.authority}"></c:out>
            </td>
            <td>
                <c:out value="${user.enabled}"></c:out>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
