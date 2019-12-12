<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring5 MVC Demo</title>
    <style>
        .error {
            color:red;
        }
    </style>
</head>
<body>

<h1>Spring5 MVC Demo Input Form</h1>
<form:form action="sendData" method="post" modelAttribute="utenteModel">
    <table>
        <tr>
            <td>Name</td>
            <td>
                <form:input path="nome" />
                <form:errors path="nome" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td>Cognome</td>
            <td>
                <form:input path="cognome" />
                <form:errors path="cognome" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <form:input path="email" />
            </td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Invia</button></td>
        </tr>
    </table>
</form:form>

</body>
</html>