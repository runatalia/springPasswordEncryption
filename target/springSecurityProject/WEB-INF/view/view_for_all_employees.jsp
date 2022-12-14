
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
    <body>
        <h3>Information for all employees</h3>
        <sec:authorize access = "hasRole('HR')">
            <input type="button" value="Salary" onclick = "window.location.href = 'hr_info'"/>
            Only for HR staff
        </sec:authorize>
        <br>
        <br>
        <sec:authorize access = "hasRole('MANAGER')">
            <input type="button" value="Perfomance" onclick="window.location.href = 'manager_info'"/>
            Only for manager
        </sec:authorize>
    </body>
</html>
