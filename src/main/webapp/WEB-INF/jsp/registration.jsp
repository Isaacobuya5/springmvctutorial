<%-- 
    Document   : registration
    Created on : 28 Sep 2022, 17:00:19
    Author     : Zakol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <style>
            .error {
                color: #ff0000;
            }
            
            .errorblock {
                color: #000;
                background-color: #ffEEEE;
                border: 3px solid #ff0000;
                padding: 8px;
                margin: 16px;
            }
        </style>
        <form:form modelAttribute="registration">
            <form:errors path="*" cssClass="errorblock" element="div" />
        <table>
            <tr>
                <td>
                    <spring:message code="name" />: 
                </td>
                <td>
                    <form:input path="name" />
                </td>
                <td>
                    <form:errors path="name" cssClass="error" />
                </td>
            </tr>
            
            <tr>
                <td colspan="3">
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
