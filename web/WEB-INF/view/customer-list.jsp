<%--
  Created by IntelliJ IDEA.
  User: MIRO
  Date: 22/03/2020
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
        <title>Customer List</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h2>CRM - Customer Relationship Manager</h2>
            </div>
        </div>
        <div id="container">
            <div id="content">
                <table>
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                    </tr>
                    <c:forEach var="customer" items="${customers}">
                        <tr>
                            <td>${customer.name}</td>
                            <td>${customer.email}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
