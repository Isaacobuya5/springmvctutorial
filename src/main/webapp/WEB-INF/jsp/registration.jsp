<%-- 
    Document   : registration
    Created on : 28 Sep 2022, 17:00:19
    Author     : Zakol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <form:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                   Name: 
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            
            <tr>
                <td colspan="2">
                    <input type="submit" value="Add Registration" />
                </td>
            </tr>
        </table>
        </form:form>
    </head>
    <body>
        <h1>Hello</h1>
    </body>
</html>
