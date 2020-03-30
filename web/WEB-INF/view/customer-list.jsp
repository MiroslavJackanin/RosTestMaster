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

                <input type="button" value="Add customer" class="add-button" onclick="window.location.href='showAddCustomerForm'; return false;"/>

                <table>
                    <tr>
                        <th>Id</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Password</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Registration Date</th>
                        <th>Action</th>
                    </tr>
                    <c:forEach var="customer" items="${customers}">

                        <c:url var="updateLink" value="/customer/showUpdateCustomerForm">
                            <c:param name="customerId" value="${customer.customerId}"/>
                        </c:url>
                        <c:url var="deleteLink" value="/customer/delete">
                            <c:param name="customerId" value="${customer.customerId}"/>
                        </c:url>

                        <tr>
                            <td>${customer.customerId}</td>
                            <td>${customer.customerFirstName}</td>
                            <td>${customer.customerLastName}</td>
                            <td>${customer.customerPassword}</td>
                            <td>${customer.customerEmail}</td>
                            <td>${customer.customerPhone}</td>
                            <td>${customer.registrationDate}</td>
                            <td>
                                <a href="${updateLink}">Update</a>
                                |
                                <a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this customer ?'))) return false">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
