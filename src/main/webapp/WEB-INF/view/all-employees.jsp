<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Employees</h2>
<br><br>

<table>

    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">
        <h:url value="/updateEmployee" var="updateButton">
            <h:param name="empId" value="${emp.id}"/>
        </h:url>

        <h:url value="/deleteEmployee" var="deleteButton">
            <h:param name="empId" value="${emp.id}"/>
        </h:url>



        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/>
            </td>
            <td>
                <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>

    </c:forEach>
</table>
<br>

<input type="button" value="Add" onclick="window.location.href = 'addNewEmployee'"/>

</body>
</html>