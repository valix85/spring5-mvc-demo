<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring5 MVC Demo</title>
    </head>
    <body>

        <h1>Spring5 MVC Demo Input Form</h1>
        <form action="sendData" method="post">
            <table>
                <tr>
                    <td>Name</td>
                    <td>
                        <input name="nome" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">Invia</button></td>
                </tr>
            </table>
        </form>

    </body>
</html>