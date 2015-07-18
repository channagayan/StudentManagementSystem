<%--
  Created by IntelliJ IDEA.
  User: Chann
  Date: 7/18/2015
  Time: 8:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

</head>
<body>
<h2>Student Management System</h2>
<div id="msg"></div>
<form action="person/save" method="post">
    <table border="1">

        <input type="hidden" name="id">

        <tr>
            <td>
        <label for="name">Person Name</label>
        <input type="text" id="name" name="name"/>
            </td>
        </tr>
        <tr>
            <td>
        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName"/>
            </td>
        </tr>
            </td>
        </tr>
        <tr>
            <td>
        <label for="age">Age</label>
        <input type="text" id="age" name="age"/>
            </td>
        </tr>
        <tr>
            <td>
        <label for="department">Department</label>
        <input type="text" id="department" name="department"/>
            </td>
        </tr>
        <tr>
            <td>
        <label for="degree">Degree</label>
        <input type="text" id="degree" name="degree"/>
            </td>
        </tr>
        <tr>
            <td>
        <label for="indexNumber">Index Number</label>
        <input type="text" id="indexNumber" name="indexNumber"/>
            </td>
        </tr>
    </table>

    <input type="submit" value="Submit"/>
</form>

<table border="1">
    <c:forEach var="person" items="${studentList}">
        <tr>
            <td>${person.name}</td>
                <td><input type="button" value="view" onclick="window.location='student/view?id=${student.id}'"/></td>
                <td><input type="button" value="delete" onclick="window.location='student/delete?id=${student.id}'"/></td>
                <td><input type="button" value="edit" onclick="window.location='student/edit?id=${student.id}'"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>