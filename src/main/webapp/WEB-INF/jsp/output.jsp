<%--
  Created by IntelliJ IDEA.
  User: Chann
  Date: 7/18/2015
  Time: 8:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Student Management System</h2>

<form action="person/save" method="post">
    <input type="hidden" name="id">
    <label for="name">Person Name</label>
    <input type="text" id="name" name="name"/>
    <input type="submit" value="Submit"/>
</form>

<table border="1">
    <c:forEach var="person" items="${personList}">
        <tr>
            <td>${person.name}</td><td><input type="button" value="delete" onclick="window.location='person/delete?id=${person.id}'"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>