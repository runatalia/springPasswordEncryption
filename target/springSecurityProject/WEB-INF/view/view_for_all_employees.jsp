
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h3>Information for all employees</h3>
    <security:authorize access = "hasRole('HR')">
        <input type="button" value="Salary" onclick = "window.location.href = 'hr_info'">
        Only for HR staff
    </security:authorize>
    <security:authorize access = "hasRole('MANAGER')">
        <input type="button" value="Perfomance" onclick="winfow.window.location.href = 'manager_info'">
        Only for manager
    </security:authorize>
</body>
</html>
